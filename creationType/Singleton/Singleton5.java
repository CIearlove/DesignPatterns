package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 静态内部类实现
 * 
 * 当 Singleton5类加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getUniqueInstance() 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder才会被加载。
 * 此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 * 
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 * @author Administrator
 *
 */
public class Singleton5 {

	private static int count;
	private Singleton5(){
		count++;
	}
	
	public static class SingletonHolder{
		private static final Singleton5 INSTANCE = new Singleton5();
	}
	
	public static Singleton5 getUniqueInstance(){
		return SingletonHolder.INSTANCE;
	}

	public static int numberOfInstantiations(){
    	return count;
    }
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++){
			executor.execute(new Instantiate5());
		}
		
		executor.shutdown();
		
		//等到所有的任务都结束
		while(!executor.isTerminated()){
			
		}
		System.out.println(Singleton5.numberOfInstantiations());
	}
    
    public static class Instantiate5 implements Runnable{

    	@Override
    	public void run() {
    		Singleton5.getUniqueInstance();
    	}
    }
}
