import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = sc.nextInt();
        // divisores
        int div = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n % i == 0)
            {
                div++;
                if(div>2)
                {
                    break;
                }
            }
        }
        // Verifica si tiene más de 2 divisores
        if(div>2)
        {
            System.out.println("NO ES PRIMO");
        }
        else {
            System.out.println("ES PRIMO");
        }
    }
}
