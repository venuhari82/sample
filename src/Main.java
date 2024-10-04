//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str= "test";
        System.out.println("The String values is: "+str);

        String str1 = new String("test");
        str1 = "test";
        System.out.println(str1);
        if(str == str1)
        {
            System.out.println("Both string are equal");
        }
        else {System.out.println("not Equal");}

        if (str.equals(str1)){
            System.out.println("Both values are equal");
        }
        else {
            System.out.println("both values not equal!..");
        }

    }
}