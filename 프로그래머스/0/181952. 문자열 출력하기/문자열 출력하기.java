import java.util.Scanner;

//import:가져오다  Scanner기능을 가져옴


public class App {
  public static void main (String [] args ){
  
    Scanner sc=new Scanner(System.in);
     //Scanner 객체 sc를 만듦

    String a=sc.next();


    System.out.println(a);
  
  sc.close();
  }


}
