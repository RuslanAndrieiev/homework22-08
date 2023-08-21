package alt.user.test;

import alt.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private User user;
    private String email = "john@gmail.com";
    private String password = "Li!gaz23";

    @BeforeEach
    void setUp() {
        user = new User(email, password);
    }

    @Test
    void testValidEmail() {
        String validEmail = "john@gmx.de";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }

    @Test
    void testEmailWithoutAt() {
        String invalidEmail = "john.gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDoubleAt() {
        String invalidEmail = "jo@hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDotAfterAt() {
        String invalidEmail = "john@gmxde";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailLastDot() {
        String invalidEmail = "john@gmxde.";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
        invalidEmail = "john@gmxd.e";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailIncorrectSymbol() {
        String invalidEmail = "jo!hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    //===========Home work==============
     /*
    TODO Homework
    1) Min 8 symbols
    2) Min one symbol in uppercase
    3) Min one symbol in lowercase
    4) Min one symbol is digit
    5) Min one symbol is a special symbol (!%@*&)
     */
    @Test
    void testValidPassword() {
        String validPassword = "Li!gaz23";
        user.getPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
    }
    @Test
     void testPasswordValid() {
        String invalidPassword = "Li+gaz23";
        user.getPassword(invalidPassword);
        assertEquals(invalidPassword, user.getPassword());
    }
    @Test
    void testPasswordSpecialSigns() {
        String invalidPassword = "Li+gaz>23";
        user.getPassword(invalidPassword);
        assertEquals(invalidPassword, user.getPassword());
    }
    @Test
    void testInValidPassword() {
        String invalidPassword = "Li.gaz23";
        user.getPassword(invalidPassword);
        assertEquals(invalidPassword, user.getPassword());
    }
}