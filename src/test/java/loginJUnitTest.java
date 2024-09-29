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
public class loginJUnitTest {
    
    public loginJUnitTest() {
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
public class UserAccountTest {
    private UserAccount userAccount;

    @BeforeEach
    public void setUp() {
        userAccount = new UserAccount();
    }

    @Test
    public void testRegisterUser_Successful() {
        String result = userAccount.registerUser("kyl_1", "Ch&&sec@ke99!", "Kyle", " Kunutu");
        assertEquals("Login successful.", result, "True");
    }

    @Test
    public void testRegisterUser_InvalidUsername() {
        String result = userAccount.registerUser("kyle!!!!!!!", "Password1", "Kyle", " Kunutu");
        assertEquals("Login failed", result, "False");
    }

    @Test
    public void testRegisterUser_InvalidPassword() {
        String result = userAccount.registerUser("kyl_1", "Ch&&sec@ke99!", "Kyle", " Kunutu");
        assertEquals("Username correctly formatted.", result, "True");
    }

    @Test
    public void testLoginUser_Successful() {
        userAccount.registerUser("Kyle!!!!!!!", "Password1", "Kyle", " Kunutu");
        assertEquals(true, userAccount.loginUser("Kyle!!!!!!!", "Ch&&sec@ke99!"), "Username incorrectly formatted.");
    }

    @Test
    public void testLoginUser_InvalidUsername() {
        userAccount.registerUser("Lerato", "Password", "Lerato", "Plank");
        assertEquals(false, userAccount.loginUser("Lerato", "Password44"), "Incorrect password.");
    }

    @Test
    public void testLoginUser_InvalidPassword() {
        userAccount.registerUser("Lea_1", "Password$$!", "Lea", "Plank");
        assertEquals(false, userAccount.loginUser("Lea_1", "Password$$!"), "Incorrect password.");
    }

}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
