import org.apache.commons.math3.complex.Complex;
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class ComplexStringProviderTest {

    @Test
    public void someMathLibraryMethodReturnsComplex() {
        ComplexStringProvider complexStringProvider = new ComplexStringProvider();
        assertEquals(complexStringProvider.provideComplexString(), "I = 3, Q = 5");
    }
}
