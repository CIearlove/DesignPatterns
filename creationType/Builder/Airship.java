package Builder;

public class Airship {
	
	private OrbitalModule OrbitalModule;//轨道舱
	
	private Engine engine;//发动机
	
	private EscapeTower escapeTower;//逃逸塔

	
	public void launch(){
		System.out.println(engine.getEngine());
		System.out.println(OrbitalModule.getOrbitalModule());
		System.out.println(escapeTower.getEscapeTower());
	}
	
	public OrbitalModule getOrbitalModule() {
		return OrbitalModule;
	}

	public Engine getEngine() {
		return engine;
	}

	public EscapeTower getEscapeTower() {
		return escapeTower;
	}

	public void setOrbitalModule(OrbitalModule orbitalModule) {
		OrbitalModule = orbitalModule;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
}
