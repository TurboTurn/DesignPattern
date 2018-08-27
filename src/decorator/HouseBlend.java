package decorator;

/**
 * @Author : ys
 * @Date : 2018/8/27 19:21 星期一
 * 一种饮料名
 **/
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
