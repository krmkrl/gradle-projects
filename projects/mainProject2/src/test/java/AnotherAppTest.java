/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.testng.annotations.*;
import static org.testng.Assert.*;

public class AnotherAppTest {
    @Test public void appHasAGreeting() {
        AnotherApp classUnderTest = new AnotherApp();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
