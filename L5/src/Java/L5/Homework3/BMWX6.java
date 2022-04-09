package Java.L5.Homework3;

public class BMWX6 implements Car{
    @Override
    public void name() {
        System.out.println("BMVX6");
    }

    @Override
    public void acceleration() {
        System.out.println("Acceleration=4.2m/s");
    }

    @Override
    public void power() {
        System.out.println("Power=300hp");
    }

    @Override
    public void engine() {
        System.out.println("Engine=4000cc");

    }

    @Override
    public void volumeofgasolin() {
        System.out.println("Volume of gasolin=8Liter");

    }
}
