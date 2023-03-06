import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitTestingUserRegistrationTest {

    @Test
    void checkFirstName(){
        JunitTestingUserRegistration firstName = new JunitTestingUserRegistration();
        assertEquals("Shraddha", firstName.Name("Shraddha"));
    }
    @Test
    void checkLastName(){
        JunitTestingUserRegistration lastName = new JunitTestingUserRegistration();
        assertEquals("Shraddha", lastName.Name("Jadhav"));
    }
    @Test
    void checkEmail(){
        JunitTestingUserRegistration email = new JunitTestingUserRegistration();
        assertEquals("jadhavshradddha5@gmail.com", email.email("jadhavshradddha5@gmail.com"));
    }
    @Test
    void checkPhone(){
        JunitTestingUserRegistration phone = new JunitTestingUserRegistration();
        assertEquals("+919011813185", phone.phone("+919011813185"));
    }
    @Test
    void checkPassword(){
        JunitTestingUserRegistration password = new JunitTestingUserRegistration();
        assertEquals("Shraddha@2802", password.password("Shraddha@2802"));
    }
}
