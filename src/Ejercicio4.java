import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        // Generamos el número aleatorio a adivinar
        int numAleatorio= ran.nextInt(100)+1;
        int numero=0;

        System.out.println("ADIVINA EL NÚMERO DEL 1 AL 100");
        // i -> contador de intentos
        for (int i = 0; numero != numAleatorio ; i++) {
            System.out.println("Ingresa un número: ");
            numero = sc.nextInt();
            if(numero<numAleatorio){
                System.out.println("El número es demasiado bajo. Intente de nuevo");
            } else if (numero>numAleatorio) {
                System.out.println("El número es demasiado alto. Intente de nuevo");
            }
            if(numero == numAleatorio){
                System.out.println("¡Felicidades! Adivinaste el número en "+(i+1)+" intentos");
            }
        }
    }
}
