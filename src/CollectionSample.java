import java.util.ArrayList;
import java.util.Objects;

public class CollectionSample {

    public static void main(String[] args) {
        //Generic object method
        ArrayList<Object> ar = new ArrayList<Object>();
        ar.add("1");
        ar.add("two");
        ar.add("three");

        System.out.println("The size of Arraylist: "+ar.size());
        System.out.println("=========");

        for(int i=0;i<ar.size();i++)
        {
            System.out.println(ar.get(i));
        }
        System.out.println("=========");
        // Integer Object

        ArrayList<Integer> arint = new ArrayList<Integer>(5);
        arint.add(1000);
        arint.add(1500);
        arint.add(175);
        arint.add(200);
        System.out.println(arint.size());;

        for ( Integer ele: arint)
        {
            System.out.println(ele);
        }
        //printing value using lamda function
        System.out.println("=========");
        arint.stream().forEach(ele1 -> System.out.println(ele1));








    }
}
