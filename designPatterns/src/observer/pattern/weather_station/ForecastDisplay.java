package observer.pattern.weather_station;

public class ForecastDisplay implements Observer, DisplayElement {

	private float currentPressure = 29.92f;
	private float lastPressure;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	@Override
	public void display() {
		System.out.println("Forecast: ");

		if (currentPressure > lastPressure) {
			System.out.println("The weather is improving!");
		} else if (currentPressure == lastPressure) {
			System.out.println("Same ol', same ol'");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
