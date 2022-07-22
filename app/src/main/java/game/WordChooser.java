package game;

import java.util.Random;

public class WordChooser {
    private Random random;
    private static final String[] DICTIONARY = {
        "Mercury",
        "Venus",
        "Earth",
        "Mars"
         };
       
         public WordChooser(Random random) {
           this.random = random;
         }
    
         public String getRandomWordFromDictionary(){

            return DICTIONARY[random.nextInt(DICTIONARY.length)];
        
          }


}
