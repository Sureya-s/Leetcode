import java.util.Scanner;
public class LoworUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ques = in.next().trim().charAt(2);
        if(ques >= 'a' && ques <= 'z'){
            System.out.println("Lowercase");

        }
        else {
            System.out.println("Uppercase");
        }

    }
}
