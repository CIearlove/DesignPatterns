package FactoryMethod;

public class ConcreteFactory1 extends Factory{

	@Override
	public Product factoryMethod() {
		
		return new ConcreteProduct1();
	}
	
	public static void processProduct1() {
        Product product = new ConcreteProduct1();
        // do something with the product1
    }
}
