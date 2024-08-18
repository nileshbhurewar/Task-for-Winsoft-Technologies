import java.util.Scanner;

public class ArrayShorting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = s.nextInt();
        }
        // checking if arayhave limited elements or empty
        if (arr.length <= 1) {
            System.out.println("Array has 1 or no elements");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }else{

            // shoring in accending order

            for(int i =0 ; i<arr.length;i++){
                for(int j = i+1 ;j<arr.length;j++){
                    if(arr[i] > arr[j]){
                        // swaping 
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Your sorted array(Accending) :");
            for(int i = 0 ;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

            for(int i =0 ; i<arr.length;i++){
                for(int j = i+1 ;j<arr.length;j++){
                    if(arr[i] < arr[j]){
                        // swaping 
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

            System.out.println("Your sorted array(Decending) :");
            
            for(int i = 0 ;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }





    }
    
}
