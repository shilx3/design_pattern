package factory.coffee.abstr;

import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.coffee.Latte;
import factory.coffee.bean.soda.Sodas;
import factory.coffee.bean.soda.Spirits;
import factory.coffee.bean.tea.MilkTea;
import factory.coffee.bean.tea.Tea;

/**
 * @program: design_pattern
 * @description: 中国饮料工厂
 * @author: shilixiang
 * @create: 2019-10-27 21:32
 **/
public class ChineseDrinkFactory implements DrinkFactory {

    @Override
    public Coffee createCoffee() {
        return new Latte();
    }

    @Override
    public Tea createTea() {
        return new MilkTea();
    }

    @Override
    public Sodas createSodas() {
        return new Spirits();
    }
}
