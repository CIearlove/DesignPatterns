package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试各种单例的实现方式所需的时间
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++){
			executor.execute(new InstantiateObject());
		}
		
		executor.shutdown();
		
		//等到所有的任务都结束
		while(!executor.isTerminated()){
			
		}
		long end = System.currentTimeMillis();
		
		System.out.println("总耗时： "+(end-start));
	}
	
	public static class InstantiateObject implements Runnable{

		/**
		 * 调用100000次实例的全局访问点
		 */
		@Override
		public void run() {
			for(int i=0;i<100000;i++){
				Singleton5.getUniqueInstance();
			}
		}
		
	}
}
