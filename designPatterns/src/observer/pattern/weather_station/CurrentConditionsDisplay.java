package observer.pattern.weather_station;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData; // Could be used later for un-registering.

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;

		display();
	}

	@Override
	public void display() {
		System.out.println("The current conditions: " + temperature
				+ "C degrees and " + humidity + "% humidity");
	}
}
