package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.println("enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("your rectangle: " +rectangle.display());
        System.out.println("perimeter: " +rectangle.getPerimeter());
        System.out.println("area: " + rectangle.getArea());
    }
}