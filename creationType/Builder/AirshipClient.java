package Builder;

public class AirshipClient {

	public static void main(String[] args) {
		//构造组件器
		AirshipBuilder builder = new ConcreteAirshipBuilder();
		//组装组件器
		AirshipDirector director = new ConcreteAirshipDirector();
		//构造、组装组件
		Airship ship = director.createAirship(builder);
		//发射火箭
		ship.launch();
	}

}
