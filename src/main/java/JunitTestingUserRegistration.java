import java.util.regex.Pattern;

public class JunitTestingUserRegistration {

    String nameInput;

    public JunitTestingUserRegistration(String nameInput) {
        this.nameInput = nameInput;
    }

    public JunitTestingUserRegistration() {
    }


    public String Name() {
        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}$", nameInput)) {
                return nameInput;
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME, "Please Enter Valid Name");
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME, "Please Enter Valid Name");
        }

    }

    public String lastName(String lastnameInput) {
        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}$", lastnameInput)) {
                return lastnameInput;
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME, "Please Enter Valid Last Name");
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME, "Please Enter Valid Last Name");
        }
    }

    public String email(String emailInput) {

        if (Pattern.matches("^([\\w]+[_+.-]?[\\w]+)@([a-zA-Z0-9]+).([a-zA-Z]+[.]?[a-zA-Z]{2,})$", emailInput)) {
            try {
                if (Pattern.matches("^([\\w]+[_+.-]?[\\w]+)@([a-zA-Z0-9]+).([a-zA-Z]+[.]?[a-zA-Z]{2,})$", emailInput)) {
                    return emailInput;
                } else {
                    System.out.println("Please Enter Valid Email ID");
                    email(emailInput);
                    return null;
                }
            } catch (UserRegistrationException e) {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL, "Please Enter Valid Email ID");
            }

        }
        return null;
    }

    public String phone(String phone) {

       /* if (Pattern.matches("^\\+[0-9]{2}[0-9]{10}$", phone)) {
            return phone;
        } else {
            System.out.println("Please Enter Valid Phone Number");
            phone(phone);
            return null;
        }*/
        try {
            if (Pattern.matches("^\\+[0-9]{2}[0-9]{10}$", phone)) {
                return phone;
            } else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONE_NUMBER, "Please Enter Phone Number");
            }
        } catch (UserRegistrationException e) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONE_NUMBER, "Please Enter Phone Number");
        }
    }

    public String password(String password) {

      /*  if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=_-])(?=\\S+$).{8,}$", password)) {
            return password;
        } else {
            System.out.println("Please Enter Valid Password");
            password(password);
            return null;*/
            try {
                if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=_-])(?=\\S+$).{8,}$", password)) {
                    return password;
                } else {
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD, "Please Enter Valid Password");
                }
            } catch (UserRegistrationException e) {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD, "Please Enter Valid Password");
            }
        }
    }

  /*  public String Name(String nameInput){


        if(Pattern.matches("^[A-Z][a-z]{2,}$",nameInput)){
            return nameInput;
        }else{
            System.out.println("Please Enter Valid Name");
            Name(nameInput);
            return null;
        }
    }
    public String email(String emailInput){

        if(Pattern.matches("^([\\w]+[_+.-]?[\\w]+)@([a-zA-Z0-9]+).([a-zA-Z]+[.]?[a-zA-Z]{2,})$",emailInput)){
            return emailInput;
        }else{
            System.out.println("Please Enter Valid Email ID");
            email(emailInput);
            return null;
        }
    }
    public String phone(String phone){

        if(Pattern.matches("^\\+[0-9]{2}[0-9]{10}$",phone)){
            return phone;
        }else{
            System.out.println("Please Enter Valid Phone Number");
            phone(phone);
            return null;
        }
    }
    public String password(String password){

        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=_-])(?=\\S+$).{8,}$",password)){
            return password;
        }else{
            System.out.println("Please Enter Valid Password");
            password(password);
            return null;
        }
    }
*/

