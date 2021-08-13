package views;

import java.util.Scanner;
import services.Authentication;
public class UserEntry
{
    Authentication auth;
    public UserEntry()
    {

    }


    public void showMainMenu()
    {
        while(true)
        {
            System.out.println("*********Welcome to the Personal Finance Management System***********");
            System.out.println();
            System.out.println("Select one of the options :");
            System.out.println("1. Log in");
            System.out.println("2. Sign-up");
            System.out.println("Forget Password");
            System.out.println("Exit the application");
            System.out.println();

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice)
            {
                case 1: new SignUp();
                    break;
                case 2: loginFlow();
                    break;
                case 3: new ForgetPassword();
                    break;
                default: System.exit(1);
            }
        }
    }

    public void loginFlow()
    {
        LoginScreen obj = new LoginScreen();
        auth = obj.userLoginDetails();
        if(auth.isAuthentic())
        {
            UserMenuScreen userMenuScreen = new UserMenuScreen(auth);
            userMenuScreen.showUserMenu();
        }
    }
}