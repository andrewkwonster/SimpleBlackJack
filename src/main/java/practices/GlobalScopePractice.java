package practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by samskim on 7/1/16.
 */
public class GlobalScopePractice {

  static Set<Integer> set;
  static List<Integer> numberList1;
  static List<Integer> numberList2;

  public static void main(String[] args){
    set = new HashSet<>();
    numberList1 = new ArrayList<>();
    numberList2 = new ArrayList<>();

//
//    for (int i = 0; i < 10; i++){
//      int num = generateNum();
//      // number is inside set
//      if (set.contains(num) == true){
//        // number is not inside set
//        i = i - 1;
//
//      }else{
//        numberList.add(num);
//        set.add(num);
//      }
//    }

    // use while loop

    int turn = 0;

    while (set.size() < 20){
      int num = generateNum();

      if (!set.contains(num)){

        set.add(num);

        if (turn == 0){
          numberList1.add(num);
          turn = 1;
        }else{
          numberList2.add(num);
          turn = 0;
        }

        System.out.println(set);
      }


    }



    for (int i = 0; i < 10; i++){

    }

//    System.out.println(numberList1);
//    System.out.println(numberList2);
    System.out.println("this is set");
    System.out.println(set);


  }

  public static int generateNum(){
    Random rand = new Random();
    int num = rand.nextInt(20) + 1;
    return num;
  }


}
