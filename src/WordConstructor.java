import java.util.Scanner;
import static java.lang.Thread.sleep;

public class WordConstructor {
    public static void main(String[] args) throws InterruptedException {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String foundLetters = "";
        String currentLetter;
        int j = 0;

        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: " + "\n");
        String currentWord = scanner.nextLine();
        System.out.println("\n" + "The word is: " + currentWord + "\n");
        sleep(1000);


        //loop through the word
        while (foundLetters.length() < currentWord.length()) {
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i] != currentWord.charAt(j)) {
                    sleep(100);
                    System.out.println(foundLetters + alphabet[i]);
                } else {
                    currentLetter = String.valueOf(alphabet[i]);
                    foundLetters += alphabet[i];
                    i = -1;
                    System.out.println("Letter found: " + currentLetter);
                    if (foundLetters.length() == currentWord.length()) {
                        System.out.println("\n" + "Word found: " + foundLetters);
                        break;
                    }
                    j++;
                }
            }
        }
    }
}
