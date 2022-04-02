package Exercise3;

import java.util.Scanner;

public class Moadele {
    public static float X(float e,float d,float b,float f,float a,float c)
    {
        float x=((e*d)-(b*f))/((a*d)-(b*c));
        return x;
    }
    public static float Y (float a,float f,float e,float c,float d,float b)
    {
        float y=((a*f)-(e*c))/((a*d)-(b*c));
        return y;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("For equation (ax+by=e)");
        System.out.print("Enter a:");
        float a= in.nextFloat();
        System.out.print("Enter b:");
        float b= in.nextFloat();
        System.out.print("Enter e");
        float e= in.nextFloat();
        System.out.println("For equation (cx+dy=f)");
        System.out.print("Enter c:");
        float c= in.nextFloat();
        System.out.print("Enter d:");
        float d= in.nextFloat();
        System.out.print("Enter f:");
        float f= in.nextFloat();
        if (((a*d)-(b*c))!=0)
        {
            System.out.println("x="+X(e,d,b,f,a,c));
            System.out.println("y="+Y(a,f,e,c,d,b));
        }
        else
        {
            System.out.print("Error");
        }



    }
}
