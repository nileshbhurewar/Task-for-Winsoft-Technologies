import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args) {
        
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = s.nextInt();
        int []arr = new int[size];
        System.out.println("Enter array elements");
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int min =  arr[0];
        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i+1]>max){
                max = arr[i+1];
            }
            if(arr[i+1]<min){
                min = arr[i+1];
            }
        }
        
        System.out.println("smallest Array element is : "+min);
        System.out.println("largest array element is : "+max);
    }
    
}
