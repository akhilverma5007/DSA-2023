//import java.util.Scanner;

public class Program_Reverse {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
        int num = 138923;
        int ans = 0;

        while (num > 0){
            int rem = num % 10;
            num /= 10;
        ans = ans * 10 + rem;
        }
        System.out.println(ans);
        
    }
}
