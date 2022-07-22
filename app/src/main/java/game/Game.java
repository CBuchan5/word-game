package game;

import java.util.ArrayList;

public class Game {

  private String word;
  private Integer attempts = 10;
  private ArrayList<Character> lettersGuessed = new ArrayList<Character>();
  public Game(WordChooser random) {
    this.word = random.getRandomWordFromDictionary();
  }

  public static void main(String[] args) {
    
  }


  public String getWordToGuess() {
    StringBuilder hiddenWord = new StringBuilder(this.word);
    
    for(int i = 0; i < hiddenWord.length(); i++) {
      if (i != 0) {
        hiddenWord.replace(i, i + 1, "_");
      }
    }
    return hiddenWord.toString();
  }


public Boolean guessLetter(Character letter){
if (this.word.indexOf(letter) != -1){
  this.lettersGuessed.add(letter);
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
