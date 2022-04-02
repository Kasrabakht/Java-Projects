package Session3.Java.Exercie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculatoraction number=new Calculatoraction();
       Scanner reader=new Scanner(System.in);
        System.out.print("Enter the first number:");
        number.a= reader.nextDouble();
        System.out.print("Enter second number:");
        number.b= reader.nextDouble();
        number.addition();
        number.multiplication();
        number.subtraction();
        number.division();

    }
}
