package Day_4;
import java.util.*;
public class Task_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputBuilder = new StringBuilder();

        // 1. Accept a multi-line paragraph from the user (press Enter twice to finish)
        System.out.println("Enter a paragraph (press Enter on an empty line to finish):");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputBuilder.append(line).append(" ");
        }

        // 2. Convert to lowercase & 3. Remove punctuation marks
        String cleanedText = inputBuilder.toString()
                                         .toLowerCase()
                                         .replaceAll("[^a-z0-9\\s]", "");

        // 4. Split the paragraph into individual words
        String[] words = cleanedText.trim().split("\\s+");

        // 5. Store each word as a key and its frequency as a value (LinkedHashMap preserves insertion order)
        Map<String, Integer> wordCounts = new LinkedHashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // 6. Display each word with its occurrence count & 7. Identify the most frequent word
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        // 8. Display total unique words and most frequent word
        System.out.println("Unique Words: " + wordCounts.size());
        if (!mostFrequentWord.isEmpty()) {
            System.out.println("Most Frequent Word: " + mostFrequentWord + " (" + maxCount + ")");
        }

        scanner.close();
    }
}
