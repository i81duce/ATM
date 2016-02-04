import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by KevinBozic on 2/3/16.
 */
public class ATM {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("SC Federal Credit Union");
        HashMap<String, Double> member = new HashMap<>();
        member.put("Kevin", 1000.0);
        member.put("Doug", 500.0);

        while (true) {
            User user = new User();
            user.loginName();
            if (!member.containsKey(user.name)) {
                System.out.println("It seems as though we don't have an account under that name. Would you like to create a new account? [y/n]");
                String existingAccount = ATM.scanner.nextLine();
                if (existingAccount.equalsIgnoreCase("y")) { // need to loop this if user doesn't type y or n
//                System.out.println("Please enter your first name to create an account:");
//                String newAccount = ATM.scanner.nextLine();
//                System.out.println("Welcome, " + newAccount + "!");
                    member.put(user.name, user.balance);
                } else if (existingAccount.equalsIgnoreCase("n")) {
                    System.out.println("We're sorry to see you go. Have a wonderful day!");
                    System.exit(0);
                } else {
                    System.out.println("This doesn't appear to be a valid input. Please type 'y' or 'n'");
                    System.exit(0);
                }
            } else {
                user.balance = member.get(user.name);
                user.choice();
                member.put(user.name, user.balance);
            }
        }
    }
}