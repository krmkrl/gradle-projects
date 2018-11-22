
public class RandomStringProvider {

    public String provideRandomString() {
        AnotherLibrary library = new AnotherLibrary();
        int randomNum = library.getRandomNum();
        return String.format("Random Num = %d", randomNum);
    }
}
