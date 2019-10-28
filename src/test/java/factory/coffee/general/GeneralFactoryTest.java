package factory.coffee.general;

import factory.coffee.bean.coffee.Coffee;
import org.junit.Test;

import java.util.Arrays;


public class GeneralFactoryTest {

    @Test
    public void produceCoffee() {
        GeneralFactory chineseFactory = new ChineseCoffeeFactory();
        Coffee[] chineseCoffee = chineseFactory.produceCoffee();
        System.out.println(Arrays.toString(chineseCoffee));
        GeneralFactory amerFactory = new AmericaCoffeeFactory();
        Coffee[] amerCoffee = amerFactory.produceCoffee();
        System.out.println(Arrays.toString(amerCoffee));
    }
}