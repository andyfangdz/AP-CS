/**
 * Created by Andy on 2/26/2015.
 */
public class test {
    public static void main(String[] args){
        String str = "test";

        if ("test".equals(str))
            System.out.println("\"test\".equals(str)");

        if (str.equals("test1")) {
            System.out.println("str.equals(\"test1\")");
        }
        else {
            System.out.println("str.equals(\"test1\") --> false");
        }
    }
}
