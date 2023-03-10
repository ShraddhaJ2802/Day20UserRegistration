import java.util.Scanner;

public class JunitMain {

    public static void main(String[] args) {
        JunitMain m = new JunitMain();
        System.out.println("Welcome to the User Registration");
        JunitTestingUserRegistration obj = new JunitTestingUserRegistration();

        Scanner sc =  new Scanner(System.in);
        System.out.println("\nEnter First Name (1st character should be Capital & Should have at least 3 characters)");
        String firstName  = sc.nextLine();

        JunitTestingUserRegistration obj1 = new JunitTestingUserRegistration(firstName);
        System.out.println("\nEnter last Name (1st character should be Capital & Should have at least 3 characters)");
        String lastName = sc.nextLine();
        JunitTestingUserRegistration obj2 = new JunitTestingUserRegistration(lastName);
        System.out.println("\nEnter Email Id : ");
        String email  = sc.nextLine();
        System.out.println("\nEnter Phone Number (Starts with +country code)");
        String phone  = sc.nextLine();
        System.out.println("\nEnter Password (should be minimum 8 characters, should contain at least 1 capital letter, number & special character )");
        String password  = sc.nextLine();

        System.out.println("User Info : "+
                        "\nName : "+obj.Name() +" " +obj.Name()+
            //    "\nName : "+obj.Name(firstName) +" " +obj.Name(lastName)+
                "\nEmail : "+obj.email(email)+
                "\nPhone : "+obj.phone(phone)+
                "\nPassword : "+obj.password(password));
    }
}
