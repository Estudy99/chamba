import java.util.Scanner;

public class Contador {

    // creando un objeto
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        // solicitando un numero
        int contador = 0, cifra;
        System.out.println("Dame una cifra");
        cifra = leer.nextInt();
        for (int i = 0; i <= cifra.length; i++) {
            contador += 1;
        }
        System.out.println("El numero tiene " + contador);
        (close.nextInt);
    }
}
