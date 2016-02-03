/**
 * Created by KevinBozic on 2/3/16.
 */
public class User {
    int balance = 100;
    String name;
    String choice;
    int amount;

    public void loginName() {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        System.out.println("Welcome, " + name + ".");
    }

    public void choice() throws Exception {
        System.out.println("What would you like to do? [check balance / withdraw / cancel]");
        choice = ATM.scanner.nextLine();

        if (choice.equalsIgnoreCase("check balance")) {
            System.out.println("Your balance is " + balance + ".");
        } else if (choice.equalsIgnoreCase("cancel")) {
            System.out.println("Thank you and come again!");
        } else if (choice.equalsIgnoreCase("withdraw")) {
            System.out.println("How much would you like to withdraw?");
            amount = ATM.scanner.nextInt();
            if (amount > balance) {
                throw new Exception("Insufficient Funds");
            } else {
                    balance = balance - amount;
                System.out.println("Withdrawal successful. You now have " + balance + " in your account. Have a nice day!");
            }
        }
    }
}
