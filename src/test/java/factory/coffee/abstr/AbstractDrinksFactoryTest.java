package factory.coffee.abstr;

import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.soda.Sodas;
import org.junit.Test;

public class AbstractDrinksFactoryTest {

    @Test
    public void createDrink() {

        this.getClass().getClassLoader().getResource("factory.properties");
        DrinkFactory chineseFactory = new ChineseDrinkFactory();
        Coffee coffee = chineseFactory.createCoffee();
        System.out.println(coffee.getName());
        DrinkFactory americanFactory = new AmericanDrinkFactory();
        Sodas sodas = americanFactory.createSodas();
        System.out.println(sodas.getName());
    }
}