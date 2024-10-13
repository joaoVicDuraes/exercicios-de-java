import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int antecessor = n-1;
        int posterior = n+1;

        System.out.println(antecessor + " " +  posterior);
        sc.close();
    }
    
}
