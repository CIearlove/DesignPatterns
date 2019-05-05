package Builder;

public interface AirshipBuilder {
	//组件1：发动机
	Engine builderEngine();
	//组件2：轨道模块
	OrbitalModule builderOrbitalModule();
	//组件3：逃生塔
	EscapeTower builderEscapeTower();
}
