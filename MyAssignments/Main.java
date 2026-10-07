import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println();
            return;
        }

        int sum = 0;
        int count = 1;
        while (count <= n){
            sum+=count;
            count++;
        }
        System.out.println("Sum: " + sum);
    }
}
