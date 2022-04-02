package Session3.Java.Exercie1;

public class Calculatoraction implements Calculator {
    public double a;
    public double b;


    @Override
    public void addition() {
        System.out.println("addition="+(a+b));
    }

    @Override
    public void subtraction() {
        System.out.println("subtraction="+(a*b));
    }

    @Override
    public void division() {
        if (b!=0){
            System.out.println("division="+(a/b));
        }
        else
        {
            System.out.println("Error");
        }


    }

    @Override
    public void multiplication() {
        System.out.println("multiplication="+(a-b));

    }
}
