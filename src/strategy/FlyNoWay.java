package strategy;

/**
 * @Author : ys
 * @Date : 2018/8/24 11:12 星期五
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
