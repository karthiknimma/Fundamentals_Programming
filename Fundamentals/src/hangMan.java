import java.util.Arrays;
import java.util.Scanner;

public class hangMan {
    String word = "karthik";
    int len = word.length();
    int guess_count = 8;
    int missing_letters = len;
    char[] output = new char[len];
    public void  playHangMan(){
        System.out.println("Welcome to Hangman!");
        System.out.println("The word now looks like this ");
        for(int i=0;i<len;i++){
            output[i] = '_';
        }
        System.out.println(Arrays.toString(output));
        System.out.println("You have "+guess_count+" guesses left.");
        Scanner scanner = new Scanner(System.in);
        while (guess_count!=0){
            String input = scanner.next();
            char guess_letter = input.charAt(0);
            if( word.contains(input)){
                int index = word.indexOf(guess_letter);
                while (index >= 0) {
//                    System.out.println(index);
                    missing_letters--;
                    output[index]=guess_letter;
                    index = word.indexOf(guess_letter, index + 1);
                }
            }
            else{
                System.out.println("There are no "+guess_letter+" in the word");
                guess_count--;
                System.out.println("You have "+guess_count+" remaining");
            }
            System.out.println("The word now looks like this "+ Arrays.toString(output));
            if(missing_letters==0){
                System.out.println("You guessed the word: "+word);
                System.out.println("You win!!");
                break;
            }
            else if(guess_count==0){
                System.out.println("You are completely hung");
                System.out.println("The word was "+word);
                System.out.println("You lose.");
            }
        }

    }
}
