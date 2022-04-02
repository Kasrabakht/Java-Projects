package Exercise1;

import java.util.Scanner;

public class Shape {
        public static void Rectangle(double l, double w) {
            double area = l * w;
            System.out.println("Area of rectangle=" + area);
            double environment = 2 * (w + l);
            System.out.println("environment of rectangle=" + environment);
        }

        public static void Square(double s) {
            double area = s * s;
            System.out.println("Area of square=" + area);
            double environment = 4 * s;
            System.out.println("environment of square=" + environment);
        }

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter the width of rectangle:");
            double width = reader.nextDouble();
            System.out.print("Enter the length of the rectangle:");
            double length = reader.nextDouble();
            System.out.print("Enter the side of square");
            double side = reader.nextDouble();
            Rectangle(length, width);
            Square(side);
        }
}
