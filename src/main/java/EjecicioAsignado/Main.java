package EjecicioAsignado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {};

        try {

            File archivo = new File("src/main/resources/numeros.txt");
            Scanner scanner = new Scanner(archivo);


            ArrayList<Integer> listaNumeros = new ArrayList<>();

            while (scanner.hasNext()) {
                listaNumeros.add(scanner.nextInt());
            }


            numeros = new int[listaNumeros.size()];
            for (int i = 0; i < listaNumeros.size(); i++) {
                numeros[i] = listaNumeros.get(i);
            }


            System.out.println("Numeros Leidos del Archivo");
            for (int num : numeros) {
                System.out.println(num + " ");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }


        System.out.println();
        System.out.println();


        System.out.println("===ESTADISTICAS===");
        int minimo = numeros[0];
        int maximo = numeros[0];
        int suma = 0;

        for (int num : numeros) {
            if (num < minimo) {
                minimo = num;
            }
            if (num > maximo) {
                maximo = num;
            }
            suma += num;
        }

        double promedio = (double) suma / numeros.length;

        // Mostrar resultados
        System.out.println("\n--- Estadísticas ---");
        System.out.println("Mínimo: " + minimo);
        System.out.println("Máximo: " + maximo);
        System.out.println("Promedio: " + promedio);

        //================NUMEROS ORDENADOS================


        Arrays.sort(numeros);

        System.out.println("\n===Numneros Ordenados===");
        for (int num : numeros) {
            System.out.println(num + " ");
        }
        System.out.println();


        try {
            FileWriter writer = new FileWriter("src/main/resources/numeros_ordenados.txt");
            for (int num : numeros) {
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("\nArchivo 'numeros_ordenados.txt' creado correctamente ✅");
        } catch (IOException e) {
            System.out.println("No se pudo escribir el archivo");
        }

    }
}