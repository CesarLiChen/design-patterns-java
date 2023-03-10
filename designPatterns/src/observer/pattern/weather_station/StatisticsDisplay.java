package observer.pattern.weather_station;

public class StatisticsDisplay implements Observer, DisplayElement {

	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;
	private int numReadings;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {

		tempSum += temp;
		numReadings += 1;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	@Override
	public void display() {

		System.out.println("Average Temperature: " + (tempSum / numReadings)
				+ "\nHighest Temperature " + maxTemp
				+ "\nLowest Temperature " + minTemp);
	}
}
