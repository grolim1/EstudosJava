import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner number = new Scanner(System.in);

        int x;

        System.out.println("Digite um Numero: ");
        x = number.nextInt();

        if (x < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }

    }
}