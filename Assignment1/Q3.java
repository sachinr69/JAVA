import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter any value");
       int n = in.nextInt();
       if(n%2==0){
        System.out.println("This number is an even");
       }
       else{
        System.out.println("This number is an odd");
       }
    }
}
