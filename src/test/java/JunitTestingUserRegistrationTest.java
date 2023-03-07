import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitTestingUserRegistrationTest {

    @Test
   /* void checkFirstName(){
        JunitTestingUserRegistration firstName = new JunitTestingUserRegistration();
        assertEquals("Shraddha", firstName.Name("Shraddha"));
    }*/

        void checkFirstName()throws UserRegistrationException
    {
            JunitTestingUserRegistration firstName = new JunitTestingUserRegistration("Shraddha");
            assertEquals("Shraddha", firstName.Name());
        }
    @Test
   /* void checkLastName(){
        JunitTestingUserRegistration lastName = new JunitTestingUserRegistration();
        assertEquals("Shraddha", lastName.Name("Jadhav"));
    }*/

        void checkLastName()throws UserRegistrationException{
            JunitTestingUserRegistration lastName = new JunitTestingUserRegistration();
            assertEquals("Jadhav", lastName.lastName("Jadhav"));
        }
    @Test
   /* void checkEmail(){
        JunitTestingUserRegistration email = new JunitTestingUserRegistration();
        assertEquals("jadhavshradddha5@gmail.com", email.email("jadhavshradddha5@gmail.com"));
    }*/
    void checkEmail()throws UserRegistrationException{
        JunitTestingUserRegistration email = new JunitTestingUserRegistration();
        assertEquals("jadhavshradddha5@gmail.com", email.email("jadhavshradddha5@gmail.com"));
    }
    @Test


    void checkPhone()throws UserRegistrationException{
        JunitTestingUserRegistration phone = new JunitTestingUserRegistration();
        assertEquals("+919011813185", phone.phone("+919011813185"));
    }
    @Test
    void checkPassword() throws UserRegistrationException{
        JunitTestingUserRegistration password = new JunitTestingUserRegistration();
        assertEquals("Shraddha@2802", password.password("Shraddha@2802"));
    }
   // String x =  "jadhavshradddha5@gmail.com";
}
