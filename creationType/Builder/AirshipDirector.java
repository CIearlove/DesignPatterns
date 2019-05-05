package Builder;

public interface AirshipDirector {
	/**
	 * 组装飞船对象
	 * @return
	 */
	Airship createAirship(AirshipBuilder builder);
	
}
