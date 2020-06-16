package set.fixation.exercise;

import entities.Client;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetFixationExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        Set <Client> set = new HashSet<>();

        
        System.out.print("How many students for course A? ");
        int nA = sc.nextInt();
        for (int i = 1; i <= nA; i++) {

            int code = sc.nextInt();
            set.add(new Client(code));
            
        }
        
        System.out.print("How many students for course B? ");
        int nB = sc.nextInt();
        for (int i = 1; i <= nB; i++) {

            int code = sc.nextInt();
            set.add(new Client(code));
            
        }
        
        System.out.print("How many students for course C? ");
        int nC = sc.nextInt();
        for (int i = 1; i <= nC; i++) {

            int code = sc.nextInt();
            set.add(new Client(code));
            
        }
        
        System.out.println("Total users: " + set.size());
        
        


        
        
        
        sc.close();
    }

}
