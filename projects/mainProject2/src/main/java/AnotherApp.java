
public class AnotherApp {

    private RandomStringProviderDecorator complexStringProviderDecorator = new RandomStringProviderDecorator();

    public String getGreeting() {
        return "Hello random world.";
    }

    public String getNiceRandomVal() {
        return complexStringProviderDecorator.provideRandomDecoratedString();
    }

    public static void main(String[] args) {
        AnotherApp anotherApp = new AnotherApp();
        System.out.println(anotherApp.getGreeting());
        System.out.println("Here is a nice random val: " + anotherApp.getNiceRandomVal());
    }
}
