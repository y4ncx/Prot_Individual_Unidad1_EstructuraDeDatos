public class Ejercicio2 {

    public static void main(String[] args) {


        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Mostrar matriz en forma de tabla
        System.out.println("Matriz en Forma:");
        for (int i = 0; i < matriz.length; i++) {            // filas
            for (int j = 0; j < matriz[i].length; j++) {     // columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Recorrer por columnas
        System.out.println("\nRecorrido por columnas:");
        for (int j = 0; j < matriz[0].length; j++) {         // columnas
            for (int i = 0; i < matriz.length; i++) {        // filas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


