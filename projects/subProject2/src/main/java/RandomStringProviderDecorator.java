
public class RandomStringProviderDecorator {

    public String provideRandomDecoratedString() {
        RandomStringProvider complexStringProvider = new RandomStringProvider();
        return "{ " + complexStringProvider.provideRandomString() + " }";
    }
}
