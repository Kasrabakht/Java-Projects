package Java.L4.Homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Map<Integer, Double> Average=new HashMap<>();
        Map<Integer,String> Name=new HashMap<>();
        Map<Integer,Integer> Studentid=new HashMap<>();
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name= reader.nextLine();
        Name.put(1,name);
        System.out.print("Enter your Average:");
        double average= reader.nextDouble();
        Average.put(1,average);
        System.out.print("Enter your Student Id:");
        int Id= reader.nextInt();
        Studentid.put(1,Id);
        for (String i : Name.values()) {
            System.out.println("Name:"+i);
        }
        for (Double i :Average.values()) {
            System.out.println("Average:"+i);
        }
        for (Integer i :Studentid.values()) {
            System.out.println("Studen Id::"+i);
        }




    }


}
