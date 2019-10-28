package factory.coffee.general;

import factory.coffee.bean.coffee.Cappuccino;
import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.coffee.Latte;

/**
 * @program: design_pattern
 * @description: 中国咖啡工厂
 * @author: shilixiang
 * @create: 2019-10-27 21:02
 **/
public class ChineseCoffeeFactory extends GeneralFactory {
    @Override
    public Coffee[] produceCoffee() {
        return new Coffee[]{new Cappuccino(), new Latte()};
    }
}
