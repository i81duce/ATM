import java.util.HashMap;

/**
 * Created by KevinBozic on 2/3/16.
 */
public class User {
    double balance = 100.0;
    String name;
    String choice;
    int amount;

    public void loginName() {
        System.out.println("SC Federal Credit Union");
        System.out.println("Please enter your first name here:");
        name = ATM.scanner.nextLine();
        System.out.println("Hi there, " + name + ".");
    }



    public void choiceMethod() throws Exception {
        System.out.println("What would you like to do? [check balance / withdraw / deposit / cancel / delete / logout]");
        choice = ATM.scanner.nextLine();

        if (choice.equalsIgnoreCase("check balance")) {
            System.out.println("Your balance is " + "$" + balance + ".");
        } else if (choice.equalsIgnoreCase("cancel")) {
            System.out.println("Thank you for banking with SC Federal Credit Union. Have a great day!");
            System.exit(0);
        } else if (choice.equalsIgnoreCase("withdraw")) {
            System.out.println("How much would you like to withdraw?");
            amount = Integer.valueOf(ATM.scanner.nextLine());
            if (amount > balance) {
                throw new Exception("Insufficient Funds");
            } else {
                    balance -= amount;
                System.out.println("Withdrawal successful. You now have " + "$"+ balance + " remaining in your account.");
            }
        } else if (choice.equalsIgnoreCase("deposit")) {
            System.out.println("How much would you like to deposit?");
            amount = Integer.valueOf(ATM.scanner.nextLine());
            balance +=  amount;
                System.out.println("Deposit successful. You now have " + "$"+ balance + " currently in your account.");
        } else if (choice.equalsIgnoreCase("delete")) {
            System.out.println("Successful. Your account has been deleted");
        } else if (choice.equalsIgnoreCase("logout")) {
            System.out.println("Thank you for banking with SC Federal Credit Union. Have a great day!");
        } else {
            System.out.println("There doesn't appear to be an option for that. Please select another:");
        }
    }
}