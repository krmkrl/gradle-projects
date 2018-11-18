import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ComplexStringProviderDecoratorTest {

    @Test
    public void someMathLibraryMethodReturnsComplex() {
        ComplexStringProviderDecorator complexStringProviderDecorator = new ComplexStringProviderDecorator();
        assertEquals(complexStringProviderDecorator.provideComplexDecoratedString(), "{ I = 3, Q = 5 }");
    }
}
