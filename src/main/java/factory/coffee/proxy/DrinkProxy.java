package factory.coffee.proxy;

import factory.coffee.abstr.AmericanDrinkFactory;
import factory.coffee.abstr.ChineseDrinkFactory;
import factory.coffee.abstr.DrinkFactory;
import factory.coffee.bean.Drink;
import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.tea.Tea;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @program: design_pattern
 * @description: 饮料生产代理
 * @author: shilixiang
 * @create: 2019-10-27 22:15
 **/
public class DrinkProxy {
    Proxy drinkProxy;

    public static Map<String, DrinkFactory> factories = new HashMap<>(16);

    static {
        try {
            String file = ClassLoader.getSystemResource("factory.properties").getFile();
            Properties properties = new Properties();
            InputStream in = new FileInputStream(file);
            properties.load(in);
            properties.forEach((k,v)->{
                String country = String.valueOf(k);
                try {
                    DrinkFactory factory = getFactoryByCountry(country);
                    factories.put(country, factory);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            System.out.println(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static DrinkFactory getFactoryByCountry(String country) throws Exception {
        Class clazz;
        if ("China".equals(country)) {
            clazz = ChineseDrinkFactory.class;
        } else if ("USA".equals(country)) {
            clazz = AmericanDrinkFactory.class;
        }else {
            throw new Exception("this country has no drink factory.");
        }

        Constructor constructor = clazz.getConstructor();
        return (DrinkFactory)constructor.newInstance();
    }

    public static Drink getDrink(String country, String type) throws Exception {
        DrinkFactory factory = factories.get(country);
        String method = "create" + captureName(type);
        Method m = factory.getClass().getMethod(method);
        return (Drink) m.invoke(factory);
    }

    private static String captureName(String name) {
        char[] cs=name.toCharArray();
        if(cs[0]>='a' && cs[0]<='z'){
            cs[0]-=32;
        }
        return String.valueOf(cs);

    }

    public static void main(String[] args) {
        try {
            Drink drink = getDrink("China", "tea");
            System.out.println(drink.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
