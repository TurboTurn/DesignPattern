package observer;

/**
 * @Author : ys
 * @Date : 2018/8/24 20:03 星期五
 **/
public interface Observer {
    void update(float temp, float humidity, float pressure);//气象观测值改变时，主题会把这些状态值传送给观察者
}
