package game;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GameTest {
  @Test public void testGetsWordToGuess() {
    WordChooser mockedRandom = mock(WordChooser.class);
    when(mockedRandom.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedRandom);
    assertEquals(game.getWordToGuess(), "M_____");
  }

  @Test public void testNumberOfAttempts() {
    WordChooser mockedRandom = mock(WordChooser.class);
    when(mockedRandom.getRandomWordFromDictionary()).thenReturn("MAKERS");
    Game game = new Game(mockedRandom);
    assertEquals(game.getRemainingAttempts(), Integer.valueOf(10));
  }

}