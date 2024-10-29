/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.poe_part1.Login;
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
    
    private Login login;
    @Test
    public void testRegisterUser_Successful() {
        String result = login.registerUser("kyl_1", "Ch&&sec@ke99!", "Kyle", " Kunutu");
        assertTrue(result.equals("Login successful."), "True");
    }

    @Test
    public void testRegisterUser_InvalidUsername() {
        String result = login.registerUser("kyle!!!!!!!", "Password1", "Kyle", " Kunutu");
        assertTrue(result.equals("Login failed"), "False");
    }

    @Test
    public void testRegisterUser_InvalidPassword() {
        String result = login.registerUser("kyl_1", "Ch&&sec@ke99!", "Kyle", " Kunutu");
        assertTrue(result.equals("Username correctly formatted."), "True");
    }

    @Test
    public void testLoginUser_Successful() {
        login.registerUser("Kyle!!!!!!!", "Password1", "Kyle", " Kunutu");
        assertTrue(login.loginUser("Kyle!!!!!!!", "Ch&&sec@ke99!"), "Username incorrectly formatted.");
    }

    @Test
    public void testLoginUser_InvalidUsername() {
        login.registerUser("Lerato", "Password", "Lerato", "Plank");
        assertTrue(!login.loginUser("Lerato", "Password44"), "Incorrect password.");
    }

    @Test
    public void testLoginUser_InvalidPassword() {
        login.registerUser("Lea_1", "Password$$!", "Lea", "Plank");
        assertTrue(!login.loginUser("Lea_1", "Password$$!"), "Incorrect password.");
    }
        public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }
        
    @org.junit.jupiter.api.Test
    public void registerUser() {
        String username = "kyl_1";
        String password = "Ch&&sec@ke99!";
        String lastName = "Kyle";
        String firstName = "Mo";
        Login validator = new Login();
        String result = validator.registerUser(username, password, firstName, lastName);
        // Test for a valid username
        assertEquals(result, true);
    }
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

