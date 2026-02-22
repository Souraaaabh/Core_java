import java.util.Scanner;

public class Stringss {
public boolean CompareStrings(){
    Scanner sc = new Scanner(System.in);
    String n1 = sc.next();
    String n2 = sc.next();
    int a = n1.compareTo(n2);
    System.out.println(a);
    return false;
}
 public void Substr(){
    String str = "My name is tony";
    String name = str.substring(11);
     System.out.println(name);
 }
}
