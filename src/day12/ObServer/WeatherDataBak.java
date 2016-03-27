package day12.ObServer;

import java.util.ArrayList;

/**
 * Created by arika on 16/3/21.
 */
public class WeatherDataBak implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataBak() {
        observers = new ArrayList();
    }

    @Override
    public void registerMyObserver(MyObserver o) {
        observers.add(o);
    }

    @Override
    public void removeMyObserver(MyObserver o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyMyObservers(){
        for(int i = 0 ;i< observers.size(); i++){
            MyObserver observer = (MyObserver) observers.get(i);
        }
    }

    public void measurementsChanged(){
        notifyMyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
