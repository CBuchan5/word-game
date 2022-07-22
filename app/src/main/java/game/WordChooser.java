package game;

import java.util.Random;

public class WordChooser {
    // private Random random;
    private static final String[] DICTIONARY = {
        "Mercury",
        "Venus",
        "Earth",
        "Mars",
        "Sun",
        "Zuth"
         };

         public static void main(String[] args) {    
        }
       
        //  public WordChooser(Random random) {
        //    this.random = random;
        //  }

        public String getRandomWordFromDictionary() {
          Random rand = new Random();
          return DICTIONARY[rand.nextInt(DICTIONARY.length)];
        }
    
        //  public String getRandomWordFromDictionary(){
        //     return DICTIONARY[random.nextInt(DICTIONARY.length)];        
        //   }


}
