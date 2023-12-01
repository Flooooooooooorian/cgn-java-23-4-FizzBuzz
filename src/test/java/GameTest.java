import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void fizzBuzzTest_whenInt4_thenReturn5AsString() {
        //GIVEN
        int a = 4;

        //WHEN
        String actual = Game.fizzBuzz(a);

        //THEN
        assertEquals("5", actual);
    }

    @Test
    public void isFizzTest_when3_thenReturnFizz(){
        //GIVEN
        int a = 3;

        //WHEN
        String actual = Game.fizzBuzz(a);

        //THEN
        assertEquals("fizz", actual);
    }

    @Test
    public void isBuzzTest_when5_thenReturnBuzz() {
        //GIVEN
        int a = 5;

        //WHEN
        String actual = Game.fizzBuzz(a);

        //THEN
        assertEquals("Buzz", actual);
    }

    @Test
    public void isFizzBuzzTest_when15_thenReturnFizzBuzz() {
        //GIVEN
        int a = 15;

        //WHEN
        String actual = Game.fizzBuzz(a);

        //THEN
        assertEquals("fizzBuzz", actual);
    }
}
