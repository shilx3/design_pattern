package builder;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HouseBuilderTest {

    @Test
    public void createHouse() {
        House house = new House();
//        普通房
        HouseBuilder gBuilder1=new GeneralHouseBuilder(house);
        Director director1=new Director(gBuilder1);
        director1.build();

        System.out.println("");
//        土豪房
        FancyHouseBuilder fancyHouseBuilder=new FancyHouseBuilder(house);
        Director director2=new Director(fancyHouseBuilder);
        director2.build();
    }
}