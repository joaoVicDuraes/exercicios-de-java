import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite o valor de a: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de c: ");
        c = sc.nextInt();

        int soma = a + b;

        if(soma >= c){
            System.out.println("Soma de a e b: " + soma);
        }else{
            System.out.println("Soma de a e b: " + soma);
            System.out.println("Resultado menor que c");
        }

        sc.close();

    }
}