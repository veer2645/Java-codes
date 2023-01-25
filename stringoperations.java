import java.util.*;

public class stringoperations {
    public static void main(String[] args) {
        String str= new String("Mahaveer");
        String str1= "Mahaveer1";

        System.out.println(str);
        System.out.println(str1);

        String s= "Mahaveer";
        String s1= " Bhajibhakare";
        System.out.println(s.concat(s1));
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.toCharArray());

        String b= "Java";
        String c= "Python";
        String b1= "Java";
        System.out.println(b.compareTo(c));
        System.out.println(b.compareTo(b1));
        System.out.println(b.equals(c));
        System.out.println(b.isEmpty());
        System.out.println(str.substring(2,5));
    }
}
