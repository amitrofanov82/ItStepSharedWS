package lesson42.observer_pattern;

//В примере описывается получение данных от метеорологической станции (класс WeatherData, рассылатель событий) и 
//использование их для вывода на экран (класс CurrentConditionsDisplay, слушатель событий). 
//Слушатель регистрируется у наблюдателя с помощью метода registerObserver (при этом слушатель заносится в список observers).
//Регистрация происходит в момент создания объекта currentDisplay, т.к. метод registerObserver применяется в конструкторе.  
//При изменении погодных данных вызывается метод notifyObservers, который в свою очередь вызывает метод update 
//у всех слушателей, передавая им обновлённые данные.
import java.util.LinkedList;
import java.util.List;

public class WeatherStation {
	
	/**
	 * CurrentConditionsDisplay is Observable. 
	 * WeatherData is observer
	 */
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay 
			= new CurrentConditionsDisplay();
		weatherData.registerObserver(currentDisplay);
		weatherData.setMeasurements(29f, 65f, 745);
		weatherData.setMeasurements(39f, 70f, 760);
		weatherData.setMeasurements(42f, 72f, 763);
	}
}

interface Observer {
	void update(float temperature, float humidity, int pressure);
}

interface Observable {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}

class WeatherData implements Observable {
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private int pressure;

	public WeatherData() {
		observers = new LinkedList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update(temperature, humidity, pressure);
	}

	public void setMeasurements(float temperature, float humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers();
	}
}

class CurrentConditionsDisplay implements Observer {
	private float temperature;
	private float humidity;
	private int pressure;

	public CurrentConditionsDisplay(Observable[] weatherDataEventSources) {
		for (Observable o : weatherDataEventSources) {
			o.registerObserver(this);
		}
	}
	
	public CurrentConditionsDisplay() {
	}

	@Override
	public void update(float temperature, float humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	private void display() {
		System.out.printf("Сейчас значения:%.1f градусов цельсия и %.1f %% влажности. Давление %d мм рт. ст.\n",
				temperature, humidity, pressure);
	}
}
