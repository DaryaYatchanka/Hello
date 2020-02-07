import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class HelloTest {

   @Test
    public void isAnogramTest() {
       Hello h = new Hello();
        String str1 = "hello World";
        String str2 = "yes";

        String expected = "No";
        String actual = h.isAnogram(str1, str2);

        assertEquals(expected, actual);

    }
    @Test
    public void isAnogramTest2() {
        Hello h = new Hello();
        String str1 = "hello";
        String str2 = "Olleh";

        String expected = "Yes";
        String actual = h.isAnogram(str1, str2);

        assertEquals(expected, actual);

    }

}