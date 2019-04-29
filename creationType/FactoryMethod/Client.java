package FactoryMethod;

public class Client {

	/**
	 * 以下的 Client 类包含了实例化的代码，这是一种错误的实现。
	 * 如果在客户类中存在这种实例化代码，就需要考虑将代码放到简单工厂中。
	 * @param args
	 */
    public static void main(String[] args){
    	
    	Product product;
    	Factory sf = new ConcreteFactory2();
    	product = sf.factoryMethod();
    	
    	System.out.println("Product---->"+product.getProductName());
    }
}
