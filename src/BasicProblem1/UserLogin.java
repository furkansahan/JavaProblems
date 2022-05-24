package BasicProblem1;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        userName = input.next();

        System.out.println("Please enter your password: ");
        password = input.next();

        if (userName.equals("furkansahan") && password.equals("javaifelse")){
            System.out.println("Congrats! You are enter!\nUsername: "+userName+"\nPassword: "+password);
        }else if ( !userName.equals("furkansahan") && password.equals("javaifelse")){
            System.out.println("No no no!! You are failed at the username");
        }else if ( userName.equals("furkansahan") && !password.equals("javaifelse")){
            System.out.println("No no no!! You are failed at the password");
        }else {
            System.out.println("Bruh!!Your value invalid...");
        }


    }
}
