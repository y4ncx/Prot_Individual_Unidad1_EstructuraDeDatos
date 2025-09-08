package EjerciciosArrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {6, 36, 2, 7, 87, 24, 75, 46, 96};

        System.out.println("Arreglo con valores originales: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion: " + i + "  Valor: " + numeros[i]);
        }

        System.out.println("\nCambiar impares por 0:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {  // aquí el cambio
                numeros[i] = 0;
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion: " + i + "  Valor: " + numeros[i]);
        }

        // reseteamos a la versión original
        int[] numeros2 = {6, 36, 2, 7, 87, 24, 75, 46, 96};

        // Multiplicar cada valor por su índice
        for (int i = 0; i < numeros2.length; i++) {
            numeros2[i] *= i;
        }

        System.out.println("\nArreglo con cada valor multiplicado por su índice:");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println("Posicion: " + i + "  Valor: " + numeros2[i]);
        }
    }
}
