import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de días: ");
        int n = sc.nextInt(); // Número de días
        System.out.println("Ingrese la cantidad de deseos por página: ");
        int m = sc.nextInt(); // Cantidad de deseos por página
        int[] deseosPorDia = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los deseos a escribir: ");
            deseosPorDia[i] = sc.nextInt(); // Deseos a escribir en el día i
        }

        int paginaActual = 1;
        for (int i = 0; i < n; i++) {
            int deseosRestantes = deseosPorDia[i];

            while (deseosRestantes > 0) {
                int espacioEnPagina = m - (deseosRestantes % m);
                if (espacioEnPagina < m) {
                    // Si hay espacio en la página actual, se resta ese espacio a los deseos restantes
                    deseosRestantes = deseosRestantes-espacioEnPagina;
                }
                // Pasar a la siguiente página si aún quedan deseos por escribir
                if (deseosRestantes > 0) {
                    paginaActual++;
                    deseosRestantes = deseosRestantes - m;
                }
            }

            System.out.println("Día " + (i + 1) + ": Pasaste de página " + paginaActual + " veces.");
            paginaActual = 1; // Reiniciar el contador de páginas para el siguiente día
        }

        sc.close();
    }
}
