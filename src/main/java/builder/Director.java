package builder;

public class Director {
    private HouseBuilder builder;
    public Director(HouseBuilder builder) {
        this.builder=builder;
    }
    public void build() {
        builder.createHouse();
    }
}
