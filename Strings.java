public class Strings{
public static void main(String[] args){
    String a="ab";
    String b="AB";
    String c="abc";
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
	boolean isEqual=a.equalsIgnoreCase(b);
	System.out.println(isEqual);
}
}
