package Java.L5.TamrinClass;

import java.util.Scanner;

public class Calculate {
    public static char first;
    public static char second;
    public static char alamat;

    public static Calculate getalamat(char alamat) {
        Calculate calculate=null;
        if (alamat == '-')
        {
         calculate=new CalcMinus();
        }
        else if (alamat=='+')
        {
            calculate=new CalcPlus();
        }
        return calculate;
    }


}
