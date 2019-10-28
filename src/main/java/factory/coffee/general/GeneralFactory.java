package factory.coffee.general;

import factory.coffee.bean.coffee.Coffee;

/**
 * @program: design_pattern
 * @description: 一般的工厂类
 * @author: shilixiang
 * @create: 2019-10-27 21:01
 **/
public abstract class GeneralFactory {

    public abstract Coffee[] produceCoffee();
}
