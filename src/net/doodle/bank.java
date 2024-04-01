package net.doodle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bank {

    public person user;
    public int maxDraw;
    private List<profile> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public bank (List<profile> users, int maxDraw){

        this.users = users;
        this.maxDraw = maxDraw;
    }

    public void addUser(person user){

       this.user = user;

        account newAccount = new account(0);

        users.add(new profile(user, newAccount));

        for(profile person : users){
            System.out.println(user);
            System.out.println();
        }
    }
}
