import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor del tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un número del 1 al 100: ");
            arreglo[i] = sc.nextInt();
            if(arreglo[i]%3!=0 && arreglo[i]%5!=0){
                suma = suma + arreglo[i];
            }
        }
        System.out.println("La suma de los elementos del arreglo, excluyendo multiplos de 3 y 5 es: "+suma);
    }
}
