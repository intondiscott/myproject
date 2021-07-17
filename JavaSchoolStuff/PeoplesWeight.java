import java.util.Scanner;

public class PeoplesWeight {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter five diffent weights of people -> ");
        double[] weight = new double[5];
        double totalWeight = 0.0;
        double averageWeight = 0.0;
        double maxWeight = 0.0;

        for (int i = 0; i < weight.length;++i){
            weight[i] = scnr.nextDouble();
            System.out.print("Enter weight ");
            System.out.print(i+1 +": ");
            System.out.println();
        }
        System.out.println();
        System.out.print("You entered: ");

        for (int i = 0; i < weight.length; i++){
            System.out.print(weight[i] + " "); // prints out each weght
            totalWeight += weight[i]; // calculates total weight
            averageWeight = totalWeight / weight.length; //calculates avg weight

        }

        for (int j = 0; j < weight.length - 1; j++){
            if (weight[j] > weight[j+1]){
                maxWeight = weight[j];
                weight[j+1] = weight[j];
            }
            else{
                maxWeight = weight[j+1];
            }
        }
        System.out.println();
        System.out.println("Total weight: " + totalWeight);
        System.out.println("Average weight: " + averageWeight);
        System.out.println("Max weight: " + maxWeight);

        return;
    }
}
