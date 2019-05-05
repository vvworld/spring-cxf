package cn.itcast.webservice.jaxws;

//http://localhost:8090/spring-cxf/ws/weather?wsdl
public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public String queryWeather(String cityName) {
		System.out.println(cityName);
		return "晴";
	}

}
