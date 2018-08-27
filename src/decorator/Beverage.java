package decorator;

/**
 * @Author : ys
 * @Date : 2018/8/27 19:12 星期一
 **/
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
