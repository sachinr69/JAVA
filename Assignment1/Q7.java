import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        int i;
        Scanner in = new Scanner(System.in);
        char c =in.next().charAt(0);
        if(c>='a'&&c<='z'){
            System.out.println(c+"->");
            i= (int)c;
            c=(char)(i-32);
            System.out.println(c);
        }
        else{
            System.out.println(c+"->");
            i= (int)c;
            c=(char)(i+32);
            System.out.println(c);
        }

    }
}
