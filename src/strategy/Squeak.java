package strategy;

/**
 * @Author : ys
 * @Date : 2018/8/24 11:15 星期五
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
