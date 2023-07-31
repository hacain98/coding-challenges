import java.util.Scanner;

public class Challenge_Week6 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        scanner.close();

        double triArea = (base * height) / 2;
        System.out.println("The area of the triangle is: " + triArea);
    }

    //Write a function that takes the base and height of a triangle and return its area.
    //
    //Examples
    //triArea(3, 2) ➞ 3
    //
    //triArea(7, 4) ➞ 14
    //
    //triArea(10, 10) ➞ 50
    //Notes
    //The area of a triangle is: (base * height) / 2
    //Don't forget to return the result.
    //If you get stuck on a challenge, find help in the Resources tab.
    //If you're really stuck, unlock solutions in the Solutions tab
}
