import java.util.Scanner;

public class Task_4_2 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int v;
        int n =  input.nextInt();
        int x =  input.nextInt();
        int sum = 0;
        int k = 0;
        while (true) {
           x--;
            v =  input.nextInt();
            sum = (86400 - v) + sum;
            k++;
            if (n <= sum) {
                break;
            }
        }
        System.out.println(k);

    }

}
