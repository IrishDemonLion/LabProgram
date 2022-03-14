// Aaron Carr
// 3/13/022
// Lab: Driving cost - methods

import java.util.Scanner;

public class LabProgram {
    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {

        return (dollarsPerGallon * milesDriven) / milesPerGallon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mpg = sc.nextDouble(); // Grabs the first int
        double dollarPerGall = sc.nextDouble(); // Grabs the second

        System.out.printf("%.2f ", drivingCost(10, mpg,dollarPerGall)); // The following outputs float-point values with two digit after decimal point
        System.out.printf("%.2f ", drivingCost(50, mpg,dollarPerGall));
        System.out.printf("%.2f ", drivingCost(400,mpg,dollarPerGall));

    }
}
