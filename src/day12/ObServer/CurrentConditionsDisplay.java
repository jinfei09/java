package day12.ObServer;

import java.util.Observable;

/**
 * Created by arika on 16/3/21.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
//        observable.addObserver(this);
        observable.addObserver((java.util.Observer) this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
