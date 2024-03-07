import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int n = sc.nextInt();
        int suma=0;
        for (int i = 1; i <= n; i++) {
            if(i%3!=0 && i%5!=0){
                suma = suma + i;
            }
        }
        System.out.println("La suma de los "+n+" numeros, excluyendo numeros multiplos de 3 y 5 es: "+suma);
    }
}
