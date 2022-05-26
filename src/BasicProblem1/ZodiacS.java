package BasicProblem1;

import java.util.Scanner;
/*Which one is your birthday months?
Aries: Koç
Leo: Aslan
Sagittarius: Yay
Taurus: Boğa
Virgo: Başak
Capricorn: Oğlak
Gemini: İkizler
Libra: Terazi
Aquarius: Kova
Cancer: Yengeç
Scorpio: Akrep
Pisces:Balık
        1-January(1-21)
        2-February(1-21)
        3-March(1-21)
        4-April
        5-May
        6-June
        7-July
        8-July
        9-September
        10-October
        11-November
        12-December*/
public class ZodiacS {
    public static void main(String[] args) {

        int day,month;
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your birthday month: ");
        month= input.nextInt();
        System.out.println("Please enter your birthday day: ");
        day= input.nextInt();
        switch(month) {
            case 1:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Capricorn");
                    } else
                        System.out.println("Your Zodiac Sign is Aquarius");

                } else System.out.println("Invalid day");
                break;
            case 2:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Aquarius");
                    } else
                        System.out.println("Your Zodiac Sign is Pisces");

                } else System.out.println("Invalid day");
                break;
            case 3:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Pisces");
                    } else
                        System.out.println("Your Zodiac Sign is Aries");

                } else System.out.println("Invalid day");
                break;
            case 4:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Aries");
                    } else
                        System.out.println("Your Zodiac Sign is Taurus");

                } else System.out.println("Invalid day");
                break;
            case 5:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Taurus");
                    } else
                        System.out.println("Your Zodiac Sign is Gemini");

                } else System.out.println("Invalid day");
                break;
            case 6:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Gemini");
                    } else
                        System.out.println("Your Zodiac Sign is Cancer");

                } else System.out.println("Invalid day");
                break;
            case 7:

                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Cancer");
                    } else
                        System.out.println("Your Zodiac Sign is Leo");

                } else System.out.println("Invalid day");
                break;

            case 8:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Leo");
                    } else
                        System.out.println("Your Zodiac Sign is Virgo");

                } else System.out.println("Invalid day");
                break;

            case 9:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Virgo");
                    } else
                        System.out.println("Your Zodiac Sign is Libra");

                } else System.out.println("Invalid day");
                break;
            case 10:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Libra");
                    } else
                        System.out.println("Your Zodiac Sign is Scorpio");

                } else System.out.println("Invalid day");
                break;
            case 11:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Scorpio");
                    } else
                        System.out.println("Your Zodiac Sign is Sagittarius");

                } else System.out.println("Invalid day");
                break;
            case 12:
                if (day > 1 && day < 31) {
                    if (day < 22) {
                        System.out.println("Your Zodiac Sign is Sagittarius");
                    } else
                        System.out.println("Your Zodiac Sign is Aquarius");

                } else System.out.println("Invalid day");
                break;

        }
    }
}
