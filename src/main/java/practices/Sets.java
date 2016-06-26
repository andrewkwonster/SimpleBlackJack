package practices;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by samskim on 6/26/16.
 */
public class Sets {


    //array, list, set, stack, queue
    public static void main(String[] args){

        // does not maintain the orders
        Set<Integer> iset = new HashSet<>();

        iset.add(5);
        iset.add(8);
        iset.add(2);
        iset.add(4);
        iset.add(2);

        System.out.println(iset.contains(7));
        System.out.println(iset.contains(8));



//        for (Integer integer : iset){
//            System.out.println(integer);
//        }

        // linkedhashset maintains the order
//        Set<Integer> iset2 = new LinkedHashSet<>();
//
//        iset2.add(5);
//        iset2.add(8);
//        iset2.add(2);
//        iset2.add(4);
//        iset2.add(2);
//
//        for (Integer integer : iset2){
//            System.out.println(integer);
//        }


    }

}
