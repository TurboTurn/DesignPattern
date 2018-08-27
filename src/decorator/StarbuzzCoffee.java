package decorator;

/**
 * @Author : ys
 * @Date : 2018/8/27 19:27 星期一
 **/

import java.io.InputStream;

/**
 * Mocha,Soy,Whip是装饰者,饮料里的调料,extends CondimentDecorator
 * Espresso,HouseBlend是饮料名,extends Beverage
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        //订一杯Espresso,不要调料
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        //订一杯HouseBlend,加调料Mocha,Soy
        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
