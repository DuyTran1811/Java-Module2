package day1.exercise;

import java.util.Scanner;

public class BT2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Number (Max 999) ");
            String str = "";
            int number = scanner.nextInt();
            if (number < 1 || number > 999) {
                System.out.println("Error!");
            } else {
                int hundreds = number / 100;
                int tens = number / 10;
                int unit = number % 10;
                if (number >= 100) {
                    switch (hundreds) {
                        case 1: str += "One hundred "; break;
                        case 2: str += "Two hundred "; break;
                        case 3: str += "Three hundred "; break;
                        case 4: str += "Four hundred "; break;
                        case 5: str += "Five hundred "; break;
                        case 6: str += "Six hundred "; break;
                        case 7: str += "Seven hundred "; break;
                        case 8: str += "Eight hundred "; break;
                        case 9: str += "Nine hundred "; break;
                    }
                }
                if (number >= 20) {
                    switch (tens) {
                        case 2: str += "Twenty "; break;
                        case 3: str += "Thirty "; break;
                        case 4: str += "Forty "; break;
                        case 5: str += "Fifty "; break;
                        case 6: str += "Sixty "; break;
                        case 7: str += "Seventy "; break;
                        case 8: str += "Eighty "; break;
                        case 9: str += "Ninety "; break;
                    }
                }
                if (number < 20) {
                    switch (number) {
                        case 10: str += "Ten"; break;
                        case 11: str += "Eleven"; break;
                        case 12: str += "Twelve"; break;
                        case 13: str += "Thirteen"; break;
                        case 14: str += "Fourteen"; break;
                        case 15: str += "Fifteen"; break;
                        case 16: str += "Sixteen"; break;
                        case 17: str += "Seventeen"; break;
                        case 18: str += "Eighteen"; break;
                        case 19: str += "Nineteen"; break;
                    }
                }
                if (number > 20 || number < 10) {
                    switch (unit) {
                        case 1: str += "One"; break;
                        case 2: str += "Two"; break;
                        case 3: str += "Three"; break;
                        case 4: str += "Four"; break;
                        case 5: str += "Five"; break;
                        case 6: str += "Six"; break;
                        case 7: str += "Seven"; break;
                        case 8: str += "Eight"; break;
                        case 9: str += "Nine"; break;
                    }
                }
                System.out.println(str);
            }
        }
    }
