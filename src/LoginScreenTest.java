import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginScreenTest {

    @Test
    public void testSuccessfulLogin() {
        LoginScreen ls = new LoginScreen();
        Assertions.assertTrue(ls.login("Rafael","password123"));
    }

    @Test
    public void testFailedLogin() {
        LoginScreen ls = new LoginScreen();
        Assertions.assertFalse(ls.login("Rafael","password321"));
    }

    @Test
    public void testAddUser() {
        LoginScreen ls = new LoginScreen();
        ls.addUser("test_user","test_pass");
        Assertions.assertTrue(ls.login("test_user","test_pass"));
    }
}