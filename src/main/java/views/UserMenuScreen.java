package views;

import java.util.Scanner;
import services.Authentication;

public class UserMenuScreen
{
    Authentication auth;

    public UserMenuScreen(Authentication auth)
    {
        this.auth = auth;
    }

    public void showUserMenu()
    {
        while(true)
        {
            System.out.println("Welcome to your profile, select one of the option");
            System.out.println();
            System.out.println("1. Add a transaction(Expense/Income)");
            System.out.println("2. Show transaction history");
            System.out.println("3. Edit a transaction");
            System.out.println("4. Delete a transaction");
            System.out.println("5. Show Aggregate details");
            System.out.println("6. Show profile details");
            System.out.println("7. Edit profile details");
            System.out.println("8. Logout from system");
            System.out.println("9. Exit the system");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch(choice)
            {
                case 1: Transaction transact = new Transaction(auth);
            }

        }
    }
}
