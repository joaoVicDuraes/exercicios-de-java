import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            c = a + b;
        }else{
            c = a * b;
        }

        System.out.println(c);

        sc.close();
    }
}
