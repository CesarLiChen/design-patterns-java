package observer.pattern.weather_station;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(15, 65, 30.4f);
		System.out.println("=====");
		weatherData.setMeasurements(20, 70, 29.2f);
		System.out.println("=====");
		weatherData.setMeasurements(10, 90, 29.2f);

	}

}
