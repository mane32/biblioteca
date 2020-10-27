/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author office
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int metd = 0;
        
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        
        System.out.println("Ingresa el número del método que se encuentra en la lista para realizarlo:");
        System.out.println("1: Areglo Shell sort");
        System.out.println();
        System.out.println("2: Areglo Bubble sort");
        System.out.println();
        System.out.println("3: Encontrar la moda en un arreglo");
        System.out.println();
        System.out.println("4: Busqueda binaria en un arreglo");
        System.out.println();
        System.out.println("5: Matriz. Intercambio de columnas");
        System.out.println();
        System.out.println("6: Espiral en una matriz");
        System.out.println();
        System.out.println("7: Matriz. Identidad ");
        System.out.println();
        System.out.println("8: Matriz. Adjunta");
        System.out.println();
        System.out.println("9: Matriz, Cuadro mágico");
        System.out.println();
        System.out.println("10: Matriz. Caracol ");
        System.out.println();
        System.out.println("11: Matriz inversa");
        System.out.println();
        System.out.println("12: Matriz. Suma de filas y columnas");
        System.out.println();
        System.out.println("Escribe el numero de la matriz o arreglo que deseas utilizar");
        System.out.println();
        entrada = bufer.readLine();
        metd = Integer.parseInt(entrada);
        
        
         switch(metd){
    
    case 1:
        System.out.println("Areglo Shell Sort");
            Metodos.shellSort();
            System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 2:
        System.out.println("Arreglo Bubble Sort");
        Metodos.bubbleSort();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 3:
        System.out.println("Encontrar la moda en un arreglo");
        Metodos.modaArreglo();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 4:
        System.out.println("Busqueda binaria en un arreglo");
        Metodos.busquedaBinaria();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 5:
        System.out.println("Dada una matriz, intercambiar los elementos de la primera columna con los de la ultima");
        Metodos.cambioColumna();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 6:
        System.out.println("Espiral en una matriz");
        Metodos.matrizEspiral();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 7:
        System.out.println("Matriz, Identidad");
        Metodos.matrizIdentidad();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 8:
        System.out.println("Matriz Adjunta");
        Metodos.matrizAdjunta();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 9:
        System.out.println("Matriz. Cuadro mágico");
        Metodos.matrizMagica();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 10:
        System.out.println("Matriz. Caracol");
        Metodos.matrizCaracol();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 11:
        System.out.println("Matriz inversa");
        Metodos.matrizInversa();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    case 12:
        System.out.println("Matriz. Suma de filas y columnas");
        Metodos.sumarFilasColumnas();
        System.exit(0);
    break;
    /* --------------------------------------------------------------------------------------- */
    default:
        System.out.println("Error el numero solicitado no existe dentro de los métodos");
        System.exit(0);
    break;
}
    }
    
}
