package game;

// import java.sql.Array;
import java.util.ArrayList;

public class Game {

  private String word;
  private Integer attempts = 10;
  private ArrayList<Character> lettersGuessed = new ArrayList<Character>();
  // private ArrayList<Integer> indexOfLetterGuessed = new ArrayList<Integer>();
  // private String[] thisArray = {"This","Is","Something"};
  public Game(WordChooser random) {
    this.word = random.getRandomWordFromDictionary();
  }

  public static void main(String[] args) {
    
  }


  public String getWordToGuess() {
    StringBuilder builder = new StringBuilder(); 

    for(int i = 0; i < this.word.length(); i++) {
      Character currentLetter = word.charAt(i);

      if (i == 0) {
        builder.append(currentLetter);
      } else {

        if (lettersGuessed.indexOf(currentLetter) != -1) {
          builder.append(currentLetter);
        } else {
          builder.append("_");
        }
      }
    }
    return builder.toString(); //M_K____
  }

  
  public Boolean guessLetter(Character letter){
    if (this.word.indexOf(letter) != -1){
      this.lettersGuessed.add(letter);
      // this.indexOfLetterGuessed.add(this.word.indexOf(letter));
      return true;
    } else {
    this.attempts -= 1;
      return false;
  }

  
  // needs to add guessed letters to a new array

}

  public Integer getRemainingAttempts(){
    return this.attempts;

  }
}
