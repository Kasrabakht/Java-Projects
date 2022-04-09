package Java.L5.Homework3;
import Java.L5.Homework3.BMWX4;
import Java.L5.Homework3.BMWX6;

import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Car car=CarFactory.getcar("BMVX4");
        car.name();
        car.acceleration();
        car.power();
        car.volumeofgasolin();
        car.engine();
        Car car1=CarFactory.getcar("BMVX6");
        car1.name();
        car1.acceleration();
        car1.power();
        car1.volumeofgasolin();
        car1.engine();
        Car car2=CarFactory.getcar("Benz");
        car2.name();
        car2.acceleration();
        car2.power();
        car2.volumeofgasolin();
        car2.engine();
    }
}

