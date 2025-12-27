import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Geometry Calculator ===");

        // Step 1: user input
        double length = getValidInput(input, "Length");
        double width = getValidInput(input, "Width");

        // Step 2:calculations
        double area = calculate(length, width, "AREA");
        double perimeter = calculate(length, width, "PERIMETER");

        // Step 3: Display results
        displayResults(length, width, area, perimeter);

        input.close();
    }

    //Task 1:
    public static double getValidInput(Scanner sc, String label) {
        double value;
        do {
            System.out.print("Enter " + label + ": ");
            value = sc.nextDouble();

            if (value < 0) {
                System.out.println("Warning: " + label + " cannot be negative. Please try again.");
            }
        } while (value < 0);

        return value;
    }

    //Task 2:

    public static double calculate(double l, double w, String type) {
        if (type.equalsIgnoreCase("AREA")) {
            return l * w;
        } else if (type.equalsIgnoreCase("PERIMETER")) {
            return 2 * (l + w);
        }
        return 0.0;
    }


    //Task 3:

    public static void displayResults(double l, double w, double a, double p) {
        System.out.println("      GEOMETRY RESULTS        ");
        System.out.printf("Length    : %.2f\n", l);
        System.out.printf("Width     : %.2f\n", w);
        System.out.println(".......................");
        System.out.printf("Area      : %.2f\n", a);
        System.out.printf("Perimeter : %.2f\n", p);
    }
}