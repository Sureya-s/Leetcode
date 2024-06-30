import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a num:  ?");
        int n = in.nextInt();
        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            rev = rev *10 + rem;
            n = (int)(n/10);


        }
        System.out.println(rev);
    }
}
