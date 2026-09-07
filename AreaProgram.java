//File: AreaProgram.java
import java.util.Scanner;

/** 
 * This program uses user input to calculate the area of different geometric shapes.
 */
public class AreaProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;

		do {
			System.out.print(
                "=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
			System.out.print("Enter the desired option[1-4]: ");
			option = keyboard.nextInt();
              // Read user input for Square, Circle, or Triangle and calculate the area accordingly
            if (option ==1) {
                System.out.print("Enter the length of the sides of square: ");
                double side = keyboard.nextDouble();
                double area = calculateSquareArea(side);
                System.out.println("The area of the square is: " + area);
              } else if (option ==2) {
                System.out.print("Enter the radius of the circle: ");
                double radius = keyboard.nextDouble();
                double area = calculateCircleArea(radius);
                System.out.println("The area of the circle is: " + area);
              } else if (option ==3) {
                System.out.print("Enter the base of the triangle: ");
                double base = keyboard.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = keyboard.nextDouble();
                double area = calculateTriangleArea(base, height);
                System.out.println("The area of the triangle is: " + area);
              } else if (option == 4) {
                System.out.println("Exiting the program.");
              } else {
                System.out.println("Invalid option. Please try again.");
              }   
		    } while (option != 4);
		
            keyboard.close();
	     }

    /**
     * Calculates the area of a square given the length of its side.
     * @param side The length of the side of the square.
     * @return The area of the square.
     */
    public static double calculateSquareArea(double side) {
    return side * side;
    }

    /**
     * Calculates the area of a circle given its radius.
     * @param radius The radius of the circle.
     * @return The area of the circle.
     */
    public static double calculateCircleArea(double radius) {
    return Math.PI * radius * radius;
    }

    /**
     * Calculates the area of a triangle given its base and height.
     * @param base The base of the triangle.
     * @param height The height of the triangle.
     * @return The area of the triangle.
     */
    public static double calculateTriangleArea(double base, double height) {
    return 0.5 * base * height;
    }
}