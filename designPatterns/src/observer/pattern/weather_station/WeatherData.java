package observer.pattern.weather_station;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observers.indexOf(o);

		if (index > 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer: observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementChanged() {
		notifyObservers();
	}

	// We set the measurements ourselves since we
	//don't have equipment for it.
	public void setMeasurements(float temperature, float humidity,  float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		measurementChanged();
	}
}
