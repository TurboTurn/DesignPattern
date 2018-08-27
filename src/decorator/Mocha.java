package decorator;

/**
 * @Author : ys
 * @Date : 2018/8/27 19:23 星期一
 **/
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.21 + beverage.cost();
    }
}
