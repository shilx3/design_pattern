package factory.coffee.abstr;

import factory.coffee.bean.coffee.Americano;
import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.soda.Coke;
import factory.coffee.bean.soda.Sodas;
import factory.coffee.bean.tea.MilkTea;
import factory.coffee.bean.tea.Tea;

/**
 * @program: design_pattern
 * @description: 美国饮料工厂
 * @author: shilixiang
 * @create: 2019-10-27 21:37
 **/
public class AmericanDrinkFactory implements DrinkFactory {

    @Override
    public Coffee createCoffee() {
        return new Americano();
    }

    @Override
    public Tea createTea() {
        return new MilkTea();
    }

    @Override
    public Sodas createSodas() {
        return new Coke();
    }
}
