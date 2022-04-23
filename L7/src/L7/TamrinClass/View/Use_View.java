package L7.TamrinClass.View;

import L7.TamrinClass.Controller.User_Controller;

import java.util.Objects;
import java.util.Scanner;

public class Use_View {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        User_Controller controller=new User_Controller();
        System.out.println("What do you want to do(Signup,Login):");
        controller.setModelAction(reader.nextLine());
        switch (controller.getModelAction())
        {
            case "Signup":
                System.out.print("Enter Username:");
                controller.setModelUsername(reader.nextLine());
                System.out.print("Enter Password:");
                controller.setModelPassword(reader.nextLine());
                System.out.print("Enter Name");
                controller.setModelName(reader.nextLine());
                System.out.print("Enter Email");
                controller.setModelEmail(reader.nextLine());
                controller.Action();
                if (controller.getModelSwtch()==true)
                {
                    System.out.print("Your Account is Created!");
                }
                break;
            case "Login":
                System.out.print("Enter your Username");
                controller.setModelUsername(reader.nextLine());
                System.out.print("Enter your Password");
                controller.setModelPassword(reader.nextLine());
                System.out.println(controller.getModelcheck_Username());
                System.out.println(controller.getModelcheck_Password());
        }

    }
}
