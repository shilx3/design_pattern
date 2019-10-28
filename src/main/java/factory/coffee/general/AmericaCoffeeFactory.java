package factory.coffee.general;

import factory.coffee.bean.coffee.Americano;
import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.coffee.Latte;

/**
 * @program: design_pattern
 * @description: 美国咖啡工厂
 * @author: shilixiang
 * @create: 2019-10-27 21:04
 **/
public class AmericaCoffeeFactory extends GeneralFactory {
    @Override
    public Coffee[] produceCoffee() {
        return new Coffee[]{new Americano(), new Latte()};
    }
}
