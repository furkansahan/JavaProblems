package BasicProblem1;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        int number, i=0, counter=0, total=0, average;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number : ");
        number=input.nextInt();

        while (i<=number){
            if (i%3==0 && i%4==0 ){
                total+=i;
                counter++;
            }
            i++;
        }
        average=total/counter;
        System.out.println("Average :"+average);
    }
}
