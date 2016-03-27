package day12.ObServer;

/**
 * Created by arika on 16/3/21.
 */
public class CurrentConditionsDisplayBak implements MyObserver, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplayBak(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerMyObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
