package strategy;

/**
 * @Author : ys
 * @Date : 2018/8/24 11:14 星期五
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
