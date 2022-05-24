package BasicProblem1;

import java.util.Scanner;

public class TaximeterApp {
    public static void main(String[] args) {
        int km,minimumPay; double perKm,startPrice,total;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the KM: ");
        km= input.nextInt();
        perKm=2.20;
        startPrice=10;
        minimumPay=20;
        total=(km*perKm)+startPrice;
        total= (total<20)? 20: total;
        System.out.println("Total Price: "+total);



    }

}
