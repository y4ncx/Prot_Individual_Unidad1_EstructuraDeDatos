public class Ejercicio3 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        // Mostrar la Matriz Original
        System.out.println("Matriz Original: ");
        imprimirMatriz(matriz);

        // Sumar todos los Elementos
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("\nSuma de todos los elementos: " + suma);

        //Intercambiar la primera fila con la ultima
        int[] temp = matriz[0];
        matriz[0] = matriz[matriz.length - 1];
        matriz[matriz.length - 1] = temp;


        System.out.println("\nMatriz despues de intercambiar primera y ultima fila: ");
        imprimirMatriz(matriz);


    }

    //Metodo imprimirMatriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}


