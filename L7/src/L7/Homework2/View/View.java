package L7.Homework2.View;
import L7.Homework2.Controller.Controller_Saipa;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Controller_Saipa controller=new Controller_Saipa();
        Scanner reader=new Scanner(System.in);
        System.out.print("Enter National Id");
        controller.setModelNational_Id(reader.nextLine());
        System.out.print("Enter Full Name");
        controller.setModelFullname(reader.nextLine());
        System.out.print("Enter Father Name");
        controller.setModelFatherName(reader.nextLine());
        System.out.print("Enter Phone");
        controller.setModelPhone(reader.nextLine());
        System.out.print("Enter Address");
        controller.setModelAddress(reader.nextLine());
        System.out.print("Which car(Peride,Quick,Shahin)do you want:");
        controller.setModelCar(reader.nextLine());
        controller.SetData();
        controller.SetCar();
        System.out.println("Car Model:"+controller.Car_Type());
        System.out.println("Car Color:"+controller.Car_Color());
        System.out.println("Car Price:"+controller.Car_Price());


    }
}
