package FactoryMethod;


public class ConcreteFactory2 extends Factory{

	@Override
	public Product factoryMethod() {
		
		return new ConcreteProduct2();
	}
	
	public static void processProduct2() {
        Product product = new ConcreteProduct2();
        // do something with the product2
    }
}
