package observer;

/**
 * @Author : ys
 * @Date : 2018/8/24 20:38 星期五
 **/
public class WeatherStation {
    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();//建立Subject
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDate);//建立Observer并订阅subject
        weatherDate.setMeasurement(80,65,30.43f);
        weatherDate.setMeasurement(82,70,29.233f);
        weatherDate.removeObserver(currentDisplay);
        weatherDate.setMeasurement(78,90,29.2f);
    }
}
