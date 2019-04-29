package SimpleFactory;

/**
 * SimpleFactory 是简单工厂实现，它被所有需要进行实例化的客户类调用。
 * @author Administrator
 *
 */
public class SimpleFactory {
	
	public static Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct1();
        } else if (type == 2) {
            return new ConcreteProduct2();
        }
        return new ConcreteProduct();
    }
	
	public static void processProduct1() {
        Product product = new ConcreteProduct1();
        // do something with the product1
    }
	
	public static void processProduct2() {
        Product product = new ConcreteProduct2();
        // do something with the product2
    }
	
	public static void processProduct() {
        Product product = new ConcreteProduct();
        // do something with the product
    }
}
