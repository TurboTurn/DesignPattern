package decorator;

/**
 * @Author : ys
 * @Date : 2018/8/27 19:17 星期一
 * Espresso是一种饮料
 **/
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
