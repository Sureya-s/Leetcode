import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.println("WELCOME TO CALCULATOR PROGRAM");
        while (true){
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op == '+'||op == '-'||op == '*'||op == '%'||op == '/'){
                System.out.print("Enter any two digits");
                int a = in.nextInt();
                int b = in.nextInt();
                if(op == '+'){
                    ans = a + b;
                    System.out.println(ans);

                }
                if(op == '-'){
                    ans = a-b;
                    System.out.println(ans);
                }
                if(op == '%'){
                    ans = a%b;
                    System.out.println(ans);

                }
                if(op == '/'){
                    ans = a/b;
                    System.out.println(ans);
                }
                if (op == '*'){
                    ans = a*b;
                    System.out.println(ans);
                }

            }
            else if(op == 'x' || op == 'X'){
                System.out.println("Exiting................");
                break;
            }
            else{
                System.out.println("Invalid Input");
            }



        }
    }
}
