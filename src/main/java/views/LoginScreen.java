package views;

import java.util.Scanner;
import services.Services;
import services.Authentication;
public class LoginScreen
{
    Services userService;
    Authentication auth;
    public LoginScreen()
    {
    }

    public Authentication userLoginDetails()
    {
        System.out.println("Enter the following details to log into the system");
        Scanner input = new Scanner(System.in);
        /*
           This is where we check if the email entered by the user exists in the system or not,
            if not then the user will be informed and taken back to the previous screen
        */
        /*
           Is the user exists then system will ask for password and try to verify the user credentials
           using the specific service class
        */
        System.out.println("Enter the email address");
        String email = input.nextLine();
        String password = null;
        if(userService.exists(email))
            password = input.nextLine();

        auth = auth.authenticate(email, passsword);
        if(auth.isAuthentic())
            System.out.println("Successfully logged in");
        System.out.println("Wrong credentials, Please try again");
        return auth;
        }
    }
}