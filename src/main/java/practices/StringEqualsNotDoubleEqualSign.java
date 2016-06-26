package practices;

/**
 * Created by andrewkwon on 6/8/16.
 */
public class StringEqualsNotDoubleEqualSign {

    public static void main(String[] args){

        int age = 1;

        if (age == 1){
            System.out.println("Age is 1");

        }else{
            System.out.println("Age is not 1");
        }

        String name = new String("Andrew");

        if (name.equals("Andrew")){
            System.out.println("Name is andrew");
        }else{
            System.out.println("Name is not andrew");
        }

    }

}
