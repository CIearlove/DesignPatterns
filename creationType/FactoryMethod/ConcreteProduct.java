package FactoryMethod;

public class ConcreteProduct implements Product{
	
	private String name = "ConcreteProduct";
	
	public String getProductName(){
		return name;
	}
	
}
