import java.util.Scanner;
public class Occurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int check = 3;
        int count =0;
        while(num > 0){
            int rem = num % 10;
            if(rem == check){
                count ++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
