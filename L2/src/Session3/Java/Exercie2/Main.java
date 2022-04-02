package Session3.Java.Exercie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the lesson (Mathematics 2,Calculus,Andishe 2,Discrete):");
            lesson dars = new lesson();
            dars.lesson = reader.nextLine();
            System.out.println("Lesson Name" + "      " + "Vahed" + "      " + "Pishniyaz" + "             " + "Hamniyaz");
            dars.Lessonname();
            dars.Vahed();
            dars.Pishniyaz();
            dars.Hamniyaz();


    }

   }


