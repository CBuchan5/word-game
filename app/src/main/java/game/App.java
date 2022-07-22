package game;
import java.util.*;

public class App {
    public String getGreeting() {
        return "Welcome! Today the word to guess is:";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        WordChooser wordChooser = new WordChooser();
        Game game = new Game(wordChooser);
        System.out.println(game.getWordToGuess());
        System.out.println("Enter one letter to guess (10 attempts remaining):");
        Scanner sc= new Scanner(System.in);
        String a= sc.nextLine(); 
        System.out.print(a);
        sc.close();
    }
}
