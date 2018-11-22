import org.testng.annotations.*;
import static org.testng.Assert.*;

public class RandomStringProviderTest {

    @Test
    public void randomNumIsInRange() {
        AnotherLibrary library = new AnotherLibrary();
        assertTrue(library.getRandomNum() >= 0);
    }
}
