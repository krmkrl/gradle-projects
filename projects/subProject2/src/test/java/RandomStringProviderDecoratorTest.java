import org.testng.annotations.*;
import static org.testng.Assert.*;

public class RandomStringProviderDecoratorTest {

    @Test
    public void someMathLibraryMethodReturnsComplex() {
        RandomStringProviderDecorator randomStringProviderDecorator = new RandomStringProviderDecorator();
        assertTrue(randomStringProviderDecorator.provideRandomDecoratedString().contains("{"));
        assertTrue(randomStringProviderDecorator.provideRandomDecoratedString().contains("}"));
    }
}
