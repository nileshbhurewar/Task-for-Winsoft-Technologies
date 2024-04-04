import java.util.HashMap;
import java.util.Map;

public class WordCount {
    
    public static Map<String, Integer> countWords(String sentence) {
        
        String[] words = sentence.trim().split("\\s+");
     
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        
        for (String word : words) {
            
            String lowercaseWord = word.toLowerCase();
            
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }
        
        return wordCountMap;
    }
    
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to demonstrate the word count program.";
        
       
        Map<String, Integer> wordCount = countWords(sentence);
        
        
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
