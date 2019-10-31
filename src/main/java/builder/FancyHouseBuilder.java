package builder;

/**
 * @program: design_pattern
 * @description: 豪华房子builder
 * @author: shilixiang
 * @create: 2019-10-29 21:51
 **/
public class FancyHouseBuilder implements HouseBuilder {
    private House house;
    public FancyHouseBuilder(House house)
    {
        this.house=house;
    }
    @Override
    public void createArea()
    {
        house.area=100;
        System.out.println("土豪房子可是不一样的大100平！");
    }

    @Override
    public void createSleeping()
    {
        house.sleeping=5;
        System.out.println("土豪房有5张床！");
    }

    @Override
    public void createCarNum()
    {
        house.carNum=666;
        System.out.println("土豪房子车库数不清！");
    }

    @Override
    public void createToilet()
    {
        house.toliet=666;
        System.out.println("土豪房子厕所大大的！");
    }

    @Override
    public House createHouse()
    {
        System.out.println("土豪房子建好啦！");
        createArea();
        createCarNum();
        createSleeping();
        createToilet();
        return house;
    }
}
