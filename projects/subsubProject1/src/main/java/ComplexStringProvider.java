import org.apache.commons.math3.complex.Complex;

public class ComplexStringProvider {

    public String provideComplexString() {
        Library library = new Library();
        Complex complex = library.someMathLibraryMethod();
        return String.format("I = %d, Q = %d", (int) complex.getReal(), (int) complex.getImaginary());
    }
}
