package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCase1 {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++){
			executor.execute(new Instantiate1());
		}
		
		executor.shutdown();
		
		//等到所有的任务都结束
		while(!executor.isTerminated()){
			
		}
		System.out.println(Singleton1.numberOfInstantiations());
	}
	
	public static class Instantiate1 implements Runnable{

		@Override
		public void run() {
			Singleton1.getUniqueInstance();
		}
		
	}
}
	

