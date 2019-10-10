import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstProject {

    @BeforeTest
    public void mainMethod() {
        System.out.println("Main Method");
    }

    @Test
    public void myFirstMethod() {
        System.out.println("My First Method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
        System.out.println("Second Line");
        System.out.println("Third Line");
        System.out.println("James' Line");
    }
}
