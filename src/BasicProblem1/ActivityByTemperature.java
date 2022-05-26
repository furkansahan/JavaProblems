package BasicProblem1;

import java.util.Scanner;

public class ActivityByTemperature {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int temp;

        System.out.print("Enter the degree: ");
        temp = inp.nextInt();

        if(temp<5)
        {
            System.out.print("You can do the ski");
        }
        else if(temp>5 && temp<15)
        {
            System.out.print("You can go to the cinema");
        }
        else if(temp==15)
        {
            System.out.print("You can go to the Cinema or You can have a picnic.");
        }
        else if(temp>15 && temp<25)
        {
            System.out.print("You can have a picnic.");
        }
        else if(temp>25)
        {
            System.out.print("You can go to the swim");
        }

    }
}
