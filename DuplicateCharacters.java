// this file basically use for Duplicating character in java as you see it
import java.util.Arrays;

public class DuplicateCharacters {
    
    public static void findDuplicateCharacters(String str) {
        
        char[] characters = str.toCharArray();
        
        
        Arrays.sort(characters);
        
        System.out.println("Duplicate characters in the string \"" + str + "\":");
        
        
        for (int i = 0; i < characters.length - 1; i++) {
            if (characters[i] == characters[i + 1]) {
        
                System.out.println(characters[i]);
                
                
                while (i < characters.length - 1 && characters[i] == characters[i + 1]) {
                    i++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        String str = "This is a string to display duplicate character";
        findDuplicateCharacters(str);
    }
}
