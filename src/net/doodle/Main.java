package net.doodle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What would you like to do? \n Create bank \n Create account \n Withdraw \n Deposit \n Check Total \n Exit");
        Map<String, bank> banks = new HashMap<>();

        while(true){

            String input = scanner.nextLine().replaceAll("\\s", "");

            if (input.equalsIgnoreCase("createbank")){
                System.out.println("What would you like to name it?");
                String name = scanner.nextLine();
                System.out.println("What should the overdraw limit be?");
                double max = Double.parseDouble(scanner.nextLine());
                bank bank = new bank(name, max);
                banks.put(name, bank);
                System.out.println("All done! Anything else?");
                continue;
            }
            else if (input.equalsIgnoreCase("createaccount")){
                    System.out.println("What bank would you like to create an account for?");
                    String name = scanner.nextLine().replaceAll("\\s", "");
                    banks.get(name).addUser();
                    System.out.println("All done! Anything else?");
                continue;
            }
            else if (input.equalsIgnoreCase("withdraw")){
                System.out.println("What bank would you like to withdraw from?");
                String choice = scanner.nextLine().replaceAll("\\s", "");
                System.out.println("What is your name?");
                String uName = scanner.nextLine().replaceAll("\\s", "");
                System.out.println("How much would you like to withdraw");
                Double cash = Double.parseDouble(scanner.nextLine());
                if(banks.get(choice).getProfile(uName).account.total > 0 && banks.get(choice).getProfile(uName).account.total + banks.get(choice).maxDraw > cash) {
                    banks.get(choice).getProfile(uName).account.withdraw(cash);
                }
                else {
                    System.out.println("You can't afford this withdrawal.");
                }
                continue;
            }
            else if (input.equalsIgnoreCase("deposit")){
                System.out.println("What bank would you like to deposit to?");
                String choice = scanner.nextLine().replaceAll("\\s", "");
                System.out.println("What is your name?");
                String uName = scanner.nextLine().replaceAll("\\s", "");
                System.out.println("How much would you like to deposit");
                Double cash = Double.parseDouble(scanner.nextLine());
                banks.get(choice).getProfile(uName).account.deposit(cash);
                continue;
            }
            else if (input.equalsIgnoreCase("checktotal")){
                System.out.println("What bank would you like to check?");
                String choice = scanner.nextLine().replaceAll("\\s", "");
                System.out.println("What is your name?");
                String uName = scanner.nextLine().replaceAll("\\s", "");
                System.out.println("Your balance is: " + banks.get(choice).getProfile(uName).account.total);
                continue;
            }
            else if (input.equalsIgnoreCase("exit") || input.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}