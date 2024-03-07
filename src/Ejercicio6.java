import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        int ta = sc.nextInt();
        int[] array = new int[ta];

        // Se ingresa un valor para el array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese un valor al array: ");
            array[i] = sc.nextInt();
        }
        // Se ordena el array de menor a mayor
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]){
                    int aux;
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        // Se imprime el array ordenado
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }
}
