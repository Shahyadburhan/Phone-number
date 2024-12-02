package phone.number;

import java.util.Scanner;

public class PhoneNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Plerse enter your phone number");
        String num = input.nextLine();
        switch (num.length()) {
            case 10:
                break;
            default:
                System.out.println("this is woring number");
        }
        if (num.length() == 10) {
            if (num.startsWith("078")) {
                System.out.println("et company");
            } else if (num.startsWith("077")) {
                System.out.println("MTN Company");
            } else if (num.startsWith("070")) {
                System.out.println("AWCC Company");

            } else if (num.startsWith("079") || num.startsWith("072")) {
                System.out.println("Roshion Company");

            } else if (num.startsWith("074")) {
                System.out.println("Salam Company");}
            else {System.out.println("Your number is worng");}
        }}}
            
