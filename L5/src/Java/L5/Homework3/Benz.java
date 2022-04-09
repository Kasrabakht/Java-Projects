package Java.L5.Homework3;

public class Benz implements Car{
    @Override
    public void name() {
        System.out.println("Benz");
    }

    @Override
    public void acceleration() {
        System.out.println("acceleration=3.9");

    }

    @Override
    public void power() {
        System.out.println("power=268HP");

    }

    @Override
    public void engine() {
        System.out.println("engin=300cc");

    }

    @Override
    public void volumeofgasolin() {
        System.out.println("10Liter");

    }
}
