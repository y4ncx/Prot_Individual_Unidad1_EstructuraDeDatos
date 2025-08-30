public class Ejercicio1 {

    int[] numeros = new int[10];

    public static void main(String[] args) {
        int[] numeros;

        numeros = new int[]{6, 36, 2, 7, 87, 24, 75, 46, 96};

        System.out.println("Arreglo con valores aleatorios: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Posicion: " + i + "  Valor: " + numeros[i] + "\n");
        }


    }
}

