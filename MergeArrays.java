import java.util.Arrays;
// this implementation basically use for merging two arrays 
public class MergeArrays {
    
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        int k = 0; 
        
        
        for (int i = 0; i < m; i++) {
            if (X[i] == 0 && k < n) {
                X[i] = Y[k++]; 
            }
        }
        
        
        Arrays.sort(X);
    }
    
    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};
        
        
        mergeArrays(X, Y);
        
       
        System.out.print("Merged Array X[] = { ");
        for (int num : X) {
            System.out.print(num + " ");
        }
        System.out.println("}");
    }
}
