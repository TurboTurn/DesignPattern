package strategy;

/**
 * @Author : ys
 * @Date : 2018/8/24 11:10 星期五
 **/
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
