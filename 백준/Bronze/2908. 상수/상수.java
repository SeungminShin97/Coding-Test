import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = (100 * (a%10)) + (((a / 10) % 10) * 10) + (a / 100); 
        b = (100 * (b%10)) + (((b / 10) % 10) * 10) + (b / 100); 
        System.out.println((a > b) ? a : b);
        sc.close();
    }
}