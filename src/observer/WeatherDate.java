package observer;

import java.util.ArrayList;

/**
 * @Author : ys
 * @Date : 2018/8/24 20:08 星期五
 **/
public class WeatherDate implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0)
            observers.remove(i);
    }

    @Override
    public void notifyObservers() {//把状态告诉每一个观察者
        for (Observer o:observers) {
            o.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){//气象站得到更新观测值时，我们通知观测者
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){//模拟气象站获得数据
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
