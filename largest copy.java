import java.util.Scanner;
public class largest {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a > b && a>c ){
            System.out.println("The greatest number is " + a);
        } else if (b > c && b > c) {
            System.out.println("The greatest number is " + b);

        }
        else {
            System.out.println("The greatest number is " + c);
        }

    }
}
