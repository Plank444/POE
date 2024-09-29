

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
public class PasswordJUnitTest {
    
    public PasswordJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
public class PasswordValidatorTest {

    @Test
    public void testValidPassword() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(true, validator.checkPasswordComplexity("Ch&&sec@ke99!"), "Password successfully captured.");
    }

    @Test
    public void testInvalidPassword_TooShort() {
        PasswordValidator validator = new PasswordValidator();
        assertEquals(false, validator.checkPasswordComplexity("Password"), "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    }
}
