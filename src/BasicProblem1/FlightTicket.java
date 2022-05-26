package BasicProblem1;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km,age,type;
        double pay=0.10,price;

        System.out.print("How old are you? : ");
        age = inp.nextInt();
        System.out.print("Distance(km): ");
        km = inp.nextInt();
        System.out.print(" 1- One Direction \n 2- Round Trip \n");
        System.out.print("Enter your flight type" +": \n");
        type = inp.nextInt();

        price = (km*pay);

        if((age > 0 && km > 0) && (type == 1 || type == 2))
        {
            if(age<12)
            {
                price -= (price*0.5);
                if(type==2)
                {
                    price -= (price*0.2);
                    price *= 2;

                }
            }
            else if (age>=12 && age<=24)
            {
                price -= (price*0.1);
                if(type==2)
                {
                    price -= (price*0.2);
                    price *= 2;

                }
            }
            else if(age>65)
            {
                price -= (price*0.3);
                if(type==2)
                {
                    price -= (price*0.2);
                    price *= 2;

                }
            }

        }
        else
        {
            System.out.println("You failed");
        }

        System.out.println("Flight Ticket: " + price);

    }
}

