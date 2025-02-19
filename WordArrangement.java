import java.util.Scanner;

public class WordArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read total number of words
        int K = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        // Read all words
        String[] words = new String[K];
        for (int i = 0; i < K; i++) {
            words[i] = scanner.nextLine();
        }
        
        // Read N and M
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int result = findMaxWords(words, N, M);
        System.out.println(result);
        
        scanner.close();
    }
    
    private static int findMaxWords(String[] words, int N, int M) {
        // Filter valid words that fit in the given space
        int validWordsCount = 0;
        for (String word : words) {
            if (word.length() <= M) {
                validWordsCount++;
            }
        }
        
        // If valid words are less than or equal to the number of lines, return the valid word count
        if (validWordsCount <= N) {
            return validWordsCount;
        }
        
        // Calculate how many words can fit in one line (max words per line)
        int maxWordsPerLine = 0;
        int remainingSpace = M;
        for (String word : words) {
            if (word.length() <= M) {
                if (remainingSpace >= word.length()) {
                    remainingSpace -= word.length() + 1; // subtract word length and one space
                    maxWordsPerLine++;
                }
            }
        }
        
        // Calculate the total number of words that can fit in N lines
        int totalWords = Math.min(maxWordsPerLine * N, validWordsCount);
        
        return totalWords;
    }
}
