import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 2; i<= num; i++){
            c = a+b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
