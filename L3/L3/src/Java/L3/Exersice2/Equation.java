package Java.Session4.Exersice2;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Equation  {

    public static void main(String[] args) throws Exception {
        Scanner reader=new Scanner(System.in);
        System.out.println("For ax^2+bx+c");
        System.out.print("Enter a:");
        double a= reader.nextDouble();
        System.out.print("Enter b:");
        double b= reader.nextDouble();
        System.out.print("Enter c:");
        double c= reader.nextDouble();
        double delta=(b*b)-(4*a*c);
        if (delta<0)
        {
            throw new Exception("Error:Delta is Negative");
        }
        else if (delta==0)
        {
            System.out.print("Answer="+(-b)/(2*a));
        }
        else if (delta>0)
        {     double x1=((-b)+sqrt(delta))/(2*a);
            double x2=((-b)-sqrt(delta))/(2*a);
            System.out.println("First Answer:"+x1);
            System.out.println("Second Answer:"+x2);
        }



    }
}
