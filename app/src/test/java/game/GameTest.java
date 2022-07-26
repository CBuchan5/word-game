package game;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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
// so first test for a single character 

@Test public void testSingleLetterCorrectly() {
  WordChooser mockedRandom = mock(WordChooser.class);
  when(mockedRandom.getRandomWordFromDictionary()).thenReturn("MAKERS");
  Game game = new Game(mockedRandom);
  assertTrue(game.guessLetter('A'));
}

@Test public void testSingleLetterIncorrectly() {
  WordChooser mockedRandom = mock(WordChooser.class);
  when(mockedRandom.getRandomWordFromDictionary()).thenReturn("MAKERS");
  Game game = new Game(mockedRandom);
  assertFalse(game.guessLetter('J'));
}

@Test public void testLetterInWord() {
  WordChooser mockedRandom = mock(WordChooser.class);
  when(mockedRandom.getRandomWordFromDictionary()).thenReturn("MAKERS");
  Game game = new Game(mockedRandom);
  assertEquals(game.guessLetter('K'), true);
  assertEquals(game.getWordToGuess(),"M_K___");
}

@Test public void testGuessLetterWrong() {
  WordChooser mockedChoser = mock(WordChooser.class);
  when(mockedChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");

  Game game = new Game(mockedChoser);

  assertEquals(game.guessLetter('O'), false);
  assertEquals(game.getWordToGuess(), "M_____");
}
}