package observer;

/**
 * @Author : ys
 * @Date : 2018/8/24 20:29 星期五
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject subject;//保存对Subject的引用

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature +"F degrees and " + humidity +"% humidity and "+ pressure+" pressure");
        //显示温度湿度
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
