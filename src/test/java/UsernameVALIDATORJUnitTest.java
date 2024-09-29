/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

   import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class UsernameVALIDATORJUnitTest {
    

public class UsernameValidatorTest {

    @Test
    public void testValidUsername() {
        UsernameValidator validator = new UsernameValidator();
        assertTrue(validator.checkUserName("user_"), "The username 'user_' should be valid.");
    }

    @Test
    public void testInvalidUsername_NoUnderscore() {
        UsernameValidator validator = new UsernameValidator();
        assertFalse(validator.checkUserName("user"), "The username 'user' should be invalid because it lacks an underscore.");
    }

    @Test
    public void testInvalidUsername_TooLong() {
        UsernameValidator validator = new UsernameValidator();
        assertFalse(validator.checkUserName("user_long"), "The username 'user_long' should be invalid because it exceeds 5 characters.");
    }
}
}

