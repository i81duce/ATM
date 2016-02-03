import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by KevinBozic on 2/3/16.
 */
public class ATM {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("South Carolina FCU");
        User newUser = new User();
        newUser.loginName();
        newUser.choice();
        }
    }