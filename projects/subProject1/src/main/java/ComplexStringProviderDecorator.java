
public class ComplexStringProviderDecorator {

    public String provideComplexDecoratedString() {
        ComplexStringProvider complexStringProvider = new ComplexStringProvider();
        return "{ " + complexStringProvider.provideComplexString() + " }";
    }
}
