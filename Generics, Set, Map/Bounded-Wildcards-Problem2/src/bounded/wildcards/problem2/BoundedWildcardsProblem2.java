package bounded.wildcards.problem2;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildcardsProblem2 {

    public static void main(String[] args) {

        //COVARIANCE  
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        list.add(20); //ERROR

        //CONTRAVARIANCE
        List <Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        
        List<? super Number> myNums = myObjs;
        
        myNums.add(10);
        myNums.add(3.14);
        
        Number x = myNums.get(0); //ERROR
        
        
        
        


    }

}
