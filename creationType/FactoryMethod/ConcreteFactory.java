package FactoryMethod;


public class ConcreteFactory extends Factory{

	@Override
	public Product factoryMethod() {
		
		return new ConcreteProduct();
	}
	
	public static void processProduct() {
        Product product = new ConcreteProduct();
        // do something with the product
    }
}
