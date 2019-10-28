package factory.coffee.abstr;

import factory.coffee.bean.coffee.Coffee;
import factory.coffee.bean.soda.Sodas;
import factory.coffee.bean.tea.Tea;

public interface DrinkFactory {

    /**
     * 制造咖啡
     * @return
     */
    Coffee createCoffee();

    /**
     * 制造茶
     * @return
     */
    Tea createTea();

    /**
     * 制造碳酸饮料
     * @return
     */
    Sodas createSodas();
}
