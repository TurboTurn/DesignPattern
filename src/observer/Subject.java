package observer;

/**
 * @Author : ys
 * @Date : 2018/8/24 20:02 星期五
 **/
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
