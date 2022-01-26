import java.util.Scanner;

public class PeopleWeights {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int numElements = 5;
        double[] userVals = new double[numElements];
        int i;

        // loop to ask for the values
        for (i = 0; i < numElements; ++i) {
            System.out.println("Enter weights " + (i + 1) + ": ");
            userVals[i] = scnr.nextDouble();
        }
        System.out.println();

        // looping and printing user values on single line with space
        System.out.print("You entered: ");
        for (i = 0; i < userVals.length; ++i) {
            System.out.print(userVals[i] + " ");
        }
        System.out.println();

        // calculating total weight of the entered values
        double totalWeight = 0.0;
        for (i = 0; i < userVals.length; ++i) {
            totalWeight += userVals[i];
        }
        System.out.println("Total weight: " + totalWeight);

        // calculating average weight of entered values
        double avgWeight = 0.0;
        for (i = 0; i < userVals.length; ++i){
            avgWeight = (totalWeight / numElements);
        }
        System.out.println("Average weight: " + avgWeight);

        // calculating max weight of entered values
        double maxWeight = 0.0;
        for (i = 0; i < userVals.length; ++i) {
            if (userVals[i] > maxWeight) {
                maxWeight = userVals[i];
            }
        }
        System.out.println("Max weight: " + maxWeight);
    }
}
