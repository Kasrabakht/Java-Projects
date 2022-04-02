package Exercise2;

import java.util.Scanner;

public class Daneshjo {
    public static float Lessons(float a,float b)
    {
        float sum=0;
        sum+=(b*a);
        return sum;

    }
    public static float Coefficient(float c)
    {
        float coeff=0;
        coeff+=c;
        return coeff;
    }
    public static float Average(float d,float e)
    {
        float ave;
        ave=(d/e);
        return ave;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float sumall = 0;
        float coefall = 0;
        System.out.print("Enter the number of lessons:");
        int b = in.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.print("Enter your grades:");
            float grade = in.nextFloat();
            System.out.print("Enter the coefficient of lesson:");
            float coef = in.nextFloat();
            sumall += Lessons(grade, coef);
            coefall += Coefficient(coef);
        }
        float ave = Average(sumall, coefall);
        System.out.println("your Average is:" + ave);
        if (ave < 10) {
            System.out.print("Mashrot");
        } else {
            System.out.print("mashrot nist");

        }
    }

}
