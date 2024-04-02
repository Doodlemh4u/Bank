package net.doodle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bank {

    public person user;
    public double maxDraw;
    public Map<String, profile> users = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    public String name;
    public bank (String name, double maxDraw){

        this.name = name;
        this.maxDraw = maxDraw;

    }

    public void addUser(){

        String fN; String lN; int age; int ssn; double deposit;

       System.out.println("What is your first name?");
       fN = scanner.nextLine();
        System.out.println("What is your last name?");
       lN = scanner.nextLine();
        System.out.println("What is your age?");
       age = Integer.parseInt(scanner.nextLine());
        System.out.println("What is your social security number");
       ssn = Integer.parseInt(scanner.nextLine());
        System.out.println("How much do you want to deposit? It must be at least $30.00.");
        deposit = Double.parseDouble(scanner.nextLine());
        String userName = fN + lN;
       if (deposit >= 30.00) {

           person user = new person(fN, lN, age, ssn);

           account newAccount = new account(0);

           users.put(userName, new profile(user, newAccount));
       }
       else {
           System.out.println("Your deposit is too small.");
           }
       }
    public profile getProfile(String uName){
        return users.get(uName);
    }
}

