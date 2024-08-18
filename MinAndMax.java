import java.util.Scanner;
// finding min and max 
public class MinAndMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean start = true;

        while (start) {
            try {
                System.out.println("Enter array size:");
                int size = s.nextInt();
                int[] arr = new int[size];
                System.out.println("Enter array elements:");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = s.nextInt();
                }

                if (arr.length <= 1) {
                    System.out.println("Array has 1 or no elements");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                    }
                } else {
                    int max = arr[0];
                    int min = arr[0];
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                        if (arr[i] < min) {
                            min = arr[i];
                        }
                    }

                    System.out.println("Smallest Array element is: " + min);
                    System.out.println("Largest Array element is: " + max);
                }

                System.out.println("Do you want to continue? [yes/no]");
                s.nextLine(); // Consume newline left-over
                String end = s.nextLine();
                if (end.equalsIgnoreCase("no")) {
                    start = false;
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                s.nextLine(); // Consume invalid input
            }
        }
        
        s.close(); // Close the scanner
    }
}
