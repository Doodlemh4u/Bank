package net.doodle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bank {

    public person user;
    public double maxDraw;
    public List<profile> users = new ArrayList<>();
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

       if (deposit >= 30.00) {

           person user = new person(fN, lN, age, ssn);

           account newAccount = new account(0);

           users.add(new profile(user, newAccount));
       }
       else {
           System.out.println("Your deposit is too small.");
           }
       }
    }

