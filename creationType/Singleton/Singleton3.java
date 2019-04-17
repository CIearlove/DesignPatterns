package Singleton;
/**
 * 懒汉式-线程安全
 * 
 * 只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。
 * 但是当一个线程进入该方法之后，其它试图进入该方法的线程都必须等待，即使 uniqueInstance 已经被实例化了。
 * 这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用。
 * 
 * @author Administrator
 *
 */
public class Singleton3 {
	
	private static Singleton3 uniqueInstance;
	private static int count;
	
    private Singleton3() {
    }

    public static synchronized Singleton3 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton3();
            count++;
        }
        return uniqueInstance;
    }
    
    public static int numberOfInstantiations(){
    	return count;
    }
}
