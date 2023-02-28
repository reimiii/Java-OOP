package navigation.application;

import static navigation.data.Application.PROCESSORS;
import static navigation.data.Constan.*;
import navigation.data.Country;
import navigation.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Bogor");

        System.out.println(city.getName());
        System.out.println(PROCESSORS);
    }
}
