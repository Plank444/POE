

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class UsernameVALIDATORJUnitTest {
    
    @org.junit.jupiter.api.Test
    public void testValidUsername() {
        UsernameValidator validator = new UsernameValidator();
        // Test for a valid username
        UserAccount userAccount = new UserAccount();
        assertEquals(true, validator.checkUserName("Kyl_1"), "Welcome " + userAccount.getFullName() + "it is great to see you.");
    }

    @org.junit.jupiter.api.Test
    public void testInvalidUsername_NoUnderscore() {
        UsernameValidator validator = new UsernameValidator();
        // Test for an invalid username without underscore
        assertEquals(false, validator.checkUserName("Kyle!!!!!!!!"), "Please ensure that your username is correctly formatted, it should contain an underscore and is no more than 5 characters in length.");
    }
}