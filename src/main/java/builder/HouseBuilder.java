package builder;

public interface HouseBuilder {
    //因为是接口，所以方法的实现要交给他不同的实现类，实现不同的方法.
    public void createArea();
    public void createSleeping();
    public void createCarNum();
    public void createToliet();
    public House createHouse();
}
