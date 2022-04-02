package Session3.Java.Exercie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        Integer number=new Integer();
        System.out.print("Enter a number:");
        number.a= reader.nextInt();
        number.isEven(number.a);
        number.isOdd(number.a);
        number.isNegative(number.a);
        number.isPosetive(number.a);
        number.isZero(number.a);

    }
}
