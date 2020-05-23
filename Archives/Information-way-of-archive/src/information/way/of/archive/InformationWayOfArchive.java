package information.way.of.archive;

import java.io.File;
import java.util.Scanner;

public class InformationWayOfArchive {

    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        
        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();
        
        File path = new File(strPath);
        
        //NAME
        System.out.println("Get name: " + path.getName());
        
        
        //WAY
        System.out.println("Get parent: " + path.getParent());
        
        
        //WAY COMPLETE
        System.out.println("Get path: " + path.getPath());
        
        
        
        sc.close();
        
        
    }

}
