package Builder;

public class ConcreteAirshipBuilder implements AirshipBuilder{

	
	@Override
	public Engine builderEngine() {
		//这里可以和工厂模式结合一下
		System.out.println("构造发动机");
		return new Engine("发动机");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		//这里可以和工厂模式结合一下
		System.out.println("构造轨道舱");
		return new OrbitalModule("轨道舱");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		//这里可以和工厂模式结合一下
		System.out.println("构造逃生塔");
		return new EscapeTower("逃生塔");
	}
	
}
