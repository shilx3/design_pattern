package factory.coffee.simple;

import factory.coffee.bean.coffee.Americano;
import factory.coffee.bean.coffee.Cappuccino;
import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.coffee.Latte;

/**
 * @program: design_pattern
 * @description: 简单工厂
 * @author: shilixiang
 * @create: 2019-10-27 20:59
 **/
public class SimpleFactory {
    /**
     * 通过类型获取Coffee实例对象
     * @param type 咖啡类型
     * @return
     */
    public static Coffee createInstance(String type){
        if("americano".equals(type)){
            return new Americano();
        }else if("cappuccino".equals(type)){
            return new Cappuccino();
        }else if("latte".equals(type)){
            return new Latte();
        }else{
            throw new RuntimeException("type["+type+"]类型不可识别，没有匹配到可实例化的对象！");
        }
    }

    public static void main(String[] args) {
        Coffee latte = SimpleFactory.createInstance("latte");
        System.out.println("创建的咖啡实例为:" + latte.getName());
        Coffee cappuccino = SimpleFactory.createInstance("cappuccino");
        System.out.println("创建的咖啡实例为:" + cappuccino.getName());
    }

}
