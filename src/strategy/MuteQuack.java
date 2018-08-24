package strategy;

/**
 * @Author : ys
 * @Date : 2018/8/24 11:16 星期五
 **/
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
