package BasicProblem1;

import java.util.Scanner;

public class OddNumberSum {
    public static void main(String[] args) {
        int number,total = 0;
        Scanner input=new Scanner(System.in);
        
        
        do {
            System.out.println("enter the number: ");
            number= input.nextInt();
            if ((number%2==1)) {
                total+=number;
            }
            

        }while(number>0);{
            System.out.println("total = " + total);
        }

    }
}



