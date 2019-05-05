package Builder;

public class ConcreteAirshipDirector implements AirshipDirector{

	@Override
	public Airship createAirship(AirshipBuilder builder) {
		//组装
		Airship airship = new Airship();
		airship.setEngine(builder.builderEngine());
		airship.setOrbitalModule(builder.builderOrbitalModule());
		airship.setEscapeTower(builder.builderEscapeTower());
		return airship;
	}

	/*
	//装配者调用构建者
	private AirshipBuilder builder;
	
	public ConcreteAirshipDirector(AirshipBuilder builder) {
		this.builder = builder;
	}
	*/
	/*
	@Override
	public Airship createAirship(AirshipBuilder builder) {
		//组装
		Airship airship = new Airship();
		airship.setEngine(builder.builderEngine());
		airship.setOrbitalModule(builder.builderOrbitalModule());
		airship.setEscapeTower(builder.builderEscapeTower());
		
		return airship;
	}
	*/
}
