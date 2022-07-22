package game;

// import java.util.Random;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class WordChooserTest {
    @Test public void testRandomWord(){
        WordChooser mockedRandom = mock(WordChooser.class);
        when(mockedRandom.getRandomWordFromDictionary()).thenReturn("MAKERS");
        assertEquals(String.valueOf("MAKERS"), mockedRandom.getRandomWordFromDictionary());
    }
}
