package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 双重校验锁-线程安全
 * 
 * uniqueInstance 只需要被实例化一次，之后就可以直接使用了。
 * 加锁操作只需要对实例化那部分的代码进行，只有当 uniqueInstance 没有被实例化时，才需要进行加锁。
 * 双重校验锁：1.先判断 uniqueInstance 是否已经被实例化，2.如果没有被实例化，那么才对实例化语句进行加锁。
 * 
 * 
 * 
 * uniqueInstance 采用 volatile 关键字修饰也是很有必要的， uniqueInstance = new Singleton(); 这段代码其实是分为三步执行：
 * 1.为 uniqueInstance 分配内存空间
 * 2.初始化 uniqueInstance
 * 3.将 uniqueInstance 指向分配的内存地址
 * 
 * 但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1>3>2。
 * 指令重排在单线程环境下不会出现问题，但是在多线程环境下会导致一个线程获得还没有初始化的实例。
 * 例如，线程 T1 执行了 1 和 3，此时 T2 调用 getUniqueInstance() 后发现 uniqueInstance 不为空，因此返回 uniqueInstance，但此时 uniqueInstance 还未被初始化。
 * 使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
 * 
 * @author Administrator
 *
 */
public class Singleton4 {
	
	private volatile static Singleton4 uniqueInstance;
	private volatile static int count; 
	
    private Singleton4() {
    	count++;
    }

    public static  Singleton4 getUniqueInstance() {
    	//判断 uniqueInstance是否已经被实例化
        if (uniqueInstance == null) {
        	//如果没有被实例化，那么才对实例化语句进行加锁
        	synchronized(Singleton4.class){
        		if (uniqueInstance == null){
        			uniqueInstance = new Singleton4();
        		}
        	}
            
        }
        return uniqueInstance;
    }
    
    public static int numberOfInstantiations(){
    	return count;
    }
    
    public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0;i<5;i++){
			executor.execute(new Instantiate4());
		}
		
		executor.shutdown();
		
		//等到所有的任务都结束
		while(!executor.isTerminated()){
			
		}
		System.out.println(Singleton4.numberOfInstantiations());
	}
    
    public static class Instantiate4 implements Runnable{

    	@Override
    	public void run() {
    		Singleton4.getUniqueInstance();
    	}
    }
    
    
}


