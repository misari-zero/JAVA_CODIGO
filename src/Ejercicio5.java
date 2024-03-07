import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ingresamos el tamaño del array
        System.out.println("Ingrese el tamaño del array: ");
        int ta = sc.nextInt();
        int[] array = new int[ta];
        // Agregamos los numeros al array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un número: ");
            array[i] = sc.nextInt();
        }
        // Invertimos el arreglo
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        //Imprimir el array invertido
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
