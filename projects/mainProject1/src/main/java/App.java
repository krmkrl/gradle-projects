
public class App {

    private ComplexStringProviderDecorator complexStringProviderDecorator = new ComplexStringProviderDecorator();

    public String getGreeting() {
        return "Hello world.";
    }

    public String getNiceComplexVal() {
        return complexStringProviderDecorator.provideComplexDecoratedString();
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println("Here is a nice complex val: " + app.getNiceComplexVal());
    }
}
