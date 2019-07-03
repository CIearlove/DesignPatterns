package ChainOfResponsibility;

public abstract class Handler {
	
	protected Handler successor;

	/**
	 * 我们知道抽象类是不能被实例化的。但抽象类是可以有构造函数的。
	 * 抽象类中构造函数的用途：
	 * 1.初始化抽象类中的一些字段，而这一切都在抽象类的派生类实例化之前发生；
	 * 2.在抽象类中实现子类必须执行的代码。
	 * @param successor
	 */
	public Handler(Handler successor) {
		this.successor = successor;
	}
	
	protected abstract void handleRequest(Request request);
}
