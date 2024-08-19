import java.util.Scanner;
public class Q1 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any value:");
        int n = in.nextInt();
        if(n>0){
            System.out.println("This is  positive number");
        }
        else if(n<0){
            System.out.println("This number is negative");

        }
        else{
            System.out.println("This number is zero");
        }
    } 
}