package factory.coffee.proxy;

import factory.coffee.abstr.DrinkFactory;
import factory.coffee.bean.Drink;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: design_pattern
 * @description: 饮料生产代理
 * @author: shilixiang
 * @create: 2019-10-27 22:15
 **/
public class DrinkProxy {
    Proxy drinkProxy;

    Map<String, DrinkFactory> factoryMap = new HashMap<>(16);

    static {
        String file = ClassLoader.getSystemResource("factory.properties").getFile();
        System.out.println(file);
    }

    public DrinkFactory getFactory(String country) {

        return null;
    }

    public static void main(String[] args) {
        System.out.println("1");
    }

}
