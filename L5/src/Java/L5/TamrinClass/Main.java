package Java.L5.TamrinClass;

import java.util.Scanner;

public class Main extends Calculate {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        String number=reader.nextLine();
        char a[]=number.toCharArray();
      first=a[0];
      alamat=a[1];
      second=a[2];
      Calculate calculate=CalcPlus.getalamat(alamat);


    }
}
