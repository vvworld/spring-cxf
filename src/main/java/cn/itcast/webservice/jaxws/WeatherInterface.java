package cn.itcast.webservice.jaxws;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {
	public String queryWeather(String cityName);
}
