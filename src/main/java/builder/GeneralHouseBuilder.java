package builder;

/**
 * @program: design_pattern
 * @description: 普通房子builder
 * @author: shilixiang
 * @create: 2019-10-29 21:50
 **/
public class GeneralHouseBuilder implements HouseBuilder {
    private House house;
    public GeneralHouseBuilder(House house)
    {
        this.house=house;
    }
    @Override
    public void createArea()
    {
        house.area=1;            //这些属性值并未用到，这里只是起到方便理解作用，就假定认为已经用到了这些属性。
        System.out.println("平民房就一平米哦！");
    }

    @Override
    public void createSleeping()
    {
        house.sleeping=1;
        System.out.println("平民房就一个卧室哦！");
    }

    @Override
    public void createCarNum()
    {
        house.carNum=0;
        System.out.println("平民房可是没有车库的哦！");
    }

    @Override
    public void createToilet()
    {
        house.toliet=1;
        System.out.println("平民房就一个厕所！");
    }

    @Override
    public House createHouse()
    {
        System.out.println("建造一个平民房！");
        createArea();
        createCarNum();
        createSleeping();
        createToilet();
        return house;
    }
}
