import java.util.*;

public class Q5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any value:");
        char c =in.next().charAt(0);
        if((c>='a'&&c<='z') || (c>='A'&&c<='Z')){
            System.out.println("Alphabet");
        }
        else if(c>='0' && c<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special character");
        }
    }
}
