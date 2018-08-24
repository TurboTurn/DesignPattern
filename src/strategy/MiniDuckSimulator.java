package strategy;

/**
 * @Author : ys
 * @Date : 2018/8/24 11:25 星期五
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        mallard.performQuack();
        mallard.swim();
        mallard.display();
    }
}
