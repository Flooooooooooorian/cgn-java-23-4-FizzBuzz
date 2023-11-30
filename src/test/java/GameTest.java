import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void fizzBuzzTest_whenInt5_thenReturn5AsString() {
        //GIVEN
        int a = 5;

        //WHEN
        String actual = Game.fizzBuzz(a);

        //THEN
        assertEquals("5", actual);
    }
}
