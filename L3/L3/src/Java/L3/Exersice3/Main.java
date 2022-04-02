package Java.Session4.Exersice3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       char a[]={'0','1','2','3','4','5','6','7','8','9'};
       Scanner reader=new Scanner(System.in);
        System.out.print("Enter you String:");
       String str= reader.nextLine();
       boolean swtch=false;
       for (int i=0;i<str.length();i++)
       {
           for (int j=0;j<=9;j++)
           {

              if (a[j] ==str.charAt(str.length()-1))
              {
                  throw new Exception("Error:The string has number!");
              }
              else
              {
                  swtch=true;
              }
           }

       }
             if (swtch=true)
             {
                 System.out.println("The size of string:"+str.length());
             }

    }
}
