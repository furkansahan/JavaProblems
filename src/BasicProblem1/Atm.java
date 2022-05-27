package BasicProblem1;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("password : ");
            password = input.nextLine();

            if (userName.equals("furkan") && password.equals("dev1234")) {
                System.out.println("Welcome to the world bank!");
                do {
                    System.out.println("1-Deposite\n" +
                                       "2-Withdraw Money\n" +
                                       "3-Balance Inquiry \n" +
                                       "4-Logout");
                    System.out.print("Choose : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print(" Amount of money: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print(" Amount of money: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("insufficient balance.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Balance Inquiry : " + balance);
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong password or username");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your right : " + right);
                }
            }
        }
    }
}