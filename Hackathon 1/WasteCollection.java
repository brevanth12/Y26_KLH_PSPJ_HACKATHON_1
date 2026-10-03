import java.util.Scanner;

public class WasteCollection
{
    static double calculateTotalWaste(double point1Waste, double point2Waste)
    {
        return point1Waste + point2Waste;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int vehicleNumber;
        double wasteCollected;
        int collectionPoints;
        char vehicleStatus;
        double point1Waste;
        double point2Waste;
        double totalWaste;

        System.out.print("Enter Vehicle Number: ");
        vehicleNumber = sc.nextInt();

        System.out.print("Enter Waste Collected (kg): ");
        wasteCollected = sc.nextDouble();

        System.out.print("Enter Number of Collection Points: ");
        collectionPoints = sc.nextInt();

        System.out.print("Enter Vehicle Status: ");
        vehicleStatus = sc.next().charAt(0);

        System.out.println("====Vehicle Details====");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected: " + wasteCollected + " kg");
        System.out.println("Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        if(wasteCollected >= 100)
        {
            System.out.println("Collection Target Achieved");
        }
        else
        {
            System.out.println("More Waste Collection Required");
        }

        System.out.println();
        System.out.print("Enter Waste at Point 1: ");
        point1Waste = sc.nextDouble();

        System.out.print("Enter Waste at Point 2: ");
        point2Waste = sc.nextDouble();

        totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        sc.close();
    }
}