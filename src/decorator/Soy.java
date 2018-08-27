package decorator;

/**
 * @Author : ys
 * @Date : 2018/8/27 19:38 星期一
 **/
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.41 + beverage.cost();
    }
}
