package factory.coffee.bean.coffee;

import factory.coffee.bean.Drink;

/**
 * @program: design_pattern
 * @description: 抽象的咖啡类
 * @author: shilixiang
 * @create: 2019-10-27 20:53
 **/
public abstract class Coffee implements Drink {
    public abstract String getName();
}
