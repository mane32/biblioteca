/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author office
 */
public class metodo {
    static void ordenarShell(int []array){
        int tam_arreglo = array.length;
        int brecha = (tam_arreglo/2);
        int recorrido;
        
        while(brecha > 0){
            for(recorrido=brecha; recorrido<tam_arreglo; recorrido++){
                int buffer = array[recorrido];
                int indice = recorrido;
                while(indice >= brecha && array[indice-brecha] > buffer){
                    array[indice] = array[indice-brecha];
                    indice -= brecha;
                }
                array[indice] = buffer;
            }
            brecha = brecha/2;
        }
    }
    
    /**
     * @throws java.io.IOException
     */
    static void shellSort() throws IOException {
        int[] arreglo;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int i,t;
        
        System.out.println("Escribe el tamaño del arreglo:");
        entrada = bufer.readLine();
        t= Integer.parseInt(entrada);
        
        arreglo = new int[t];
        System.out.println("------------------------------");

        Scanner teclado = new Scanner(System.in);

        for(i=0; i<arreglo.length; i++)
        {
            System.out.printf("Introduzca número %d: ", i+1);
            arreglo[i] = teclado.nextInt();
        }
        System.out.println("------------------------------");
        System.out.println("Arreglo original:"+ Arrays.toString(arreglo));
        ordenarShell(arreglo);
        System.out.println("Arreglo ordenado"+ Arrays.toString(arreglo));
    }
    
    static void bubbleSort(){
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca tamaño del arreglo: ");
        num = sc.nextInt();

        int Arreglo1[] = new int[num];

        for (int i = 0; i < Arreglo1.length; i++) {
            System.out.println("Introduzca un número para el elemento " + (i + 1) + ": ");
            Arreglo1[i] = sc.nextInt();
        }
        System.out.println("      -SIN ORDENAR-");
        
        mostrarA(Arreglo1);
        
        System.out.println("¿Desea ordenar los números? S/N");
        Scanner sc2 = new Scanner(System.in);
        String res = sc2.nextLine();
        
        if (res.equalsIgnoreCase("S"))
        {
            
            System.out.println("       -ORDENADO-   ");
            
            ordenaBurbuja(Arreglo1);
        }
    }
    
    static void ordenaBurbuja(int Arreglo1[]) {
        
        for (int i = 0; i < Arreglo1.length - 1; i++) {
            
            for (int j = 0; j < Arreglo1.length - 1; j++)
            { 
                if (Arreglo1[j] > Arreglo1[j + 1]) {
                    
                    int temp = Arreglo1[j + 1];
                    
                    Arreglo1[j + 1] = Arreglo1[j];
                    Arreglo1[j] = temp;
                    
                }
            }
        }
        
        mostrarA(Arreglo1);
    }
    
    static void mostrarA(int Arreglo1[]) {
        System.out.println("|-----------------------|");
        
        for (int i = 0; i < Arreglo1.length; i++)
        {
         System.out.print(" Elemento " + (i + 1) + " -----> " + Arreglo1[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }
    
    static void modaArreglo(){
        Scanner sc = new Scanner (System.in);
        int moda = 0 ;
        int maxvecesrepetidas = 0;
        int [] M;
        int datos;
        
        System.out.println("¿Cual es el tamaño del arreglo?");
         datos = sc.nextInt();
         
        M = new int [datos];
        System.out.println("Ingrese los numeros del arreglo");
        for (int i = 0; i < M.length; i++) {
            int vecesrepetido = 0;
            M[i] = sc.nextInt();
             
            for (int j = 0; j < M.length; j++) {
                if (M[i] == M[j]) {
                    vecesrepetido++;
                }
                
            }if (vecesrepetido > maxvecesrepetidas) {
                moda = M[i];
               maxvecesrepetidas  = vecesrepetido ;
            }
            
        }System.out.println("La moda es  " + moda + " Se repitio " + maxvecesrepetidas);
    }
 
    static void busquedaBinaria() throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        int [] elemento;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int t;
        
        System.out.println("Escribe el tamaño del arreglo:");
        entrada = bufer.readLine();
        t= Integer.parseInt(entrada);
        
        elemento = new int[t];
        System.out.println("------------------------------");
        
        
        System.out.println("Ingresa " + t + " numeros:" );
        
        for(int i=0; i<elemento.length; i++){
            //uso de scanner para ingresar datos al arreglo
            elemento[i] = sc.nextInt();
            
            
        }
        System.out.println("                  ");
        //Uso de herramientas de arreglo para ordenar los datos del arreglo
   Arrays.sort(elemento);
   System.out.println("            ");
   //Frace para denotar que el arreglo ah sido ordenado
        System.out.println("Arreglo ordenado: ");
        System.out.println("                 ");
        //Uso de herramientas de arreglo para imprimir en pantalla el arreglo ordenado
        System.out.println(Arrays.toString(elemento));
        System.out.println("                 ");
        //Frace dirigida a usuario para ingresar dato a buscar dentro del arreglo
        System.out.println("Ingrsa un numero a buscar: ");
        //declaracion de variable tipo numerico y uso de scanner para que el usuario pueda almacenar datos dentro de esta variable
        int buscar = sc.nextInt();
        //declaracion de variables para el uso de la busqueda
        int n=elemento.length, inicio=0, centro=0;
        int fin=n-1;
        //declaracion de variable que se activara solo cuando se encuentre el dato buscado
        boolean bandera=false;
        //inicio de bucle para la busqueda del valor ingresado por el usuario
        while(inicio<=fin){
            //declaracion de la variable centro es igual a inicio mas fin entre 2
            centro=(inicio+fin)/2;
            //Si el centro se encuentra en el numero buscado en el arreglo la bandera actua con true y el bucle termina con el break
            if(elemento[centro]==buscar){
                bandera=true;
                break;
                
            }
            //Pero si el numero del centro no es el que se buscaba el fin se mueve a la izquierda del centro
            else if(buscar<elemento[centro]){
                fin=centro-1;
                
            }
            //Si no es asi el inicio se mueve a la derecha del centro
            else{
                inicio=centro+1;
            }
        }
        //uso de if para verificar que el dato fue encontrado
        if(bandera==true){
            System.out.println("El numero se encuentra en la posición: " +(centro));
        }
        //en el caso de que no se encontrara el dato aparecera este enunciado
        else{
            System.out.println("¡¡¡Numero no encontrado!!!");
        }
        
    }
    
    static void cambioColumna(){
        Scanner sn=new Scanner(System.in);
    int[][] matriz = new int [5][5];
        int cont=1;
        
        int[] aux= new int[5];
        int[] auxU= new int[5];
        int resultado [][] = matriz;
        System.out.println("Ingresa los valores de una matriz 5*5");
        for (int i = 0 ; i < matriz.length; i++){
           for (int j = 0; j < matriz[i].length; j++){ 
               System.out.println("Escriba el valor de la fila " + i + " y columna " + j + " de la matriz");
               matriz[i][j] = sn.nextInt();
               
               resultado[i][j]=matriz[i][j];
           }
       }
        
        System.out.println("Matriz original");
        for (int[] matriz1 : matriz) {
            for (int col = 0; col < matriz1.length; col++) {
                System.out.print(matriz1[col] + "\t");
            } 
            System.out.println();
        }
        // Inicio del cambio de columnas
        for(cont=0; cont<5; cont++){
            auxU[cont]= matriz[cont][4];
        }
        for (int[] matriz1 : matriz) {
            for (int col = 4; col > 0; col--) {
                matriz1[col] = matriz1[col-1];
            } 
        }
        
        for(cont=0; cont<5; cont++){
            matriz[cont][0]= auxU[cont];
        }
        
        for(cont=0; cont<5; cont++){
            aux[cont]= matriz[cont][1];
        }
        
        for (int[] matriz1 : matriz) {
            for (int col = 1; col < 4; col++) {
                matriz1[col] = matriz1[col+1];
            } 
        }
        
        for(cont=0; cont<5; cont++){
            matriz[cont][4]= aux[cont];
        }
        
        
        System.out.println();
        System.out.println("Matriz intercambiada");
        System.out.println();
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = 0; col < matriz[fila].length; col++){ 
		System.out.print(matriz[fila][col] + "\t");
                } 
            System.out.println();
        
        }}
    
    public static void matrizEspiral() {
          Scanner sc;
          sc = new Scanner(System.in);
        
          System.out.println("Ingresa el numero de filas de la matriz");
          int n1=sc.nextInt();
          System.out.println("");
          System.out.println("Ingresa el numero de columnas de la matriz ");
          int n2=sc.nextInt();
    if(n1 != n2)
    {
        System.out.println("Falla, las matriz no es cuadrada");
        System.exit(0);
    }
    else{
    int [][] matriz;
    matriz = new int[n1][n2];
    int a=0;
    int b=n1-1;
    int valor=0;
    
              for (int[] matriz1 : matriz) {
                  System.out.println("Ingresa los datos que almacenara la fila superior");
                  for(int i = a; i<=b; i++){
                      matriz[a][i] =sc.nextInt() ;
                  }System.out.println("");
                  
                  System.out.println("Ingresa los valores que almacenara la columna del extremo superior");
                  for(int i = a+1; i<=b; i++){
                      matriz[i][b] = sc.nextInt() ;
                  }System.out.println("");
                  
                  System.out.println("Ingresa los valores que almacenara la fila inferior de derecha a izquierda");
                  for(int i = b-1 ;i>=a; i--){
                      matriz[b][i] = sc.nextInt();
                  }System.out.println("");
                  
                  System.out.println("Ingresa los valores que almacenara la columna del extremo izquierdo de abajo hacia arriba");
                  for(int i = b-1 ;i>=a+1; i--){
                      matriz[i][a] = sc.nextInt();
                  }System.out.println("");
                  
                  a++;
                  b--;      }
    
              for (int[] matriz1 : matriz) {
                  for (int i = 0; i < matriz1.length; i++) {
                      System.out.print(matriz1[i] + "\t");
                  }
                  System.out.println();
              }
    
    }
      }
    
    static void matrizIdentidad() {
        
        int n;
        int matriz1[][] = new int [3][3];
        
        System.out.println("Matriz 1");
        for ( int i=0; i<3; i++){
            for (int j=0; j<3; j++) {
                if (i==j){
                    matriz1[1][1]=1;
                }
                else
                {
                    matriz1[1][1]=0;
                }
                System.out.println(matriz1[1][1] + "");
            }
            System.out.println("");
        }
        
        
    }
    
    static Scanner sc = new Scanner (System.in);
    static void mAdjunta(int matrizA[][]){
        int matrizAdjun[][]=new int[3][3];
        
        //CALCULO DE ADJUNTOS
       matrizAdjun[0][0]=(matrizA[1][1]*matrizA[2][2]) - (matrizA[1][2]*matrizA[2][1]);
       matrizAdjun[0][1]=-((matrizA[1][0]*matrizA[2][2]) - (matrizA[1][2]*matrizA[2][0]));
       matrizAdjun[0][2]=(matrizA[1][0]*matrizA[2][1]) - (matrizA[1][1]*matrizA[2][0]);
       
       matrizAdjun[1][0]=-((matrizA[0][1]*matrizA[2][2]) - (matrizA[0][2]*matrizA[2][1]));
       matrizAdjun[1][1]=(matrizA[0][0]*matrizA[2][2]) - (matrizA[0][2]*matrizA[2][0]);
       matrizAdjun[1][2]=-((matrizA[0][0]*matrizA[2][1]) - (matrizA[0][1]*matrizA[2][0]));
       
       matrizAdjun[2][0]=(matrizA[0][1]*matrizA[1][2]) - (matrizA[0][2]*matrizA[1][1]);
       matrizAdjun[2][1]=-((matrizA[0][0]*matrizA[1][2]) - (matrizA[0][2]*matrizA[1][0]));
       matrizAdjun[2][2]=(matrizA[0][0]*matrizA[1][1]) - (matrizA[0][1]*matrizA[1][0]);
       
       
       //MATRIZ ADJUNTA
       System.out.println("la Matriz Adjunta de la Matriz A es: ");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){                
                 System.out.print(matrizAdjun[i][j]+" "); 
           }   
          System.out.println(); //Salto de línea
       }
      System.out.println();
    }
    
    public static void matrizAdjunta() {
        int matrizA[][]=new int[3][3];
        
        //introducimos números de la Matriz A
        System.out.println("Introduce los números de la Matriz A:");
        for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                  System.out.print("Fila "+(i+1)+" Columna "+(j+1)+" = "); 
                  matrizA[i][j]=sc.nextInt();
             }     
        }     
        System.out.println("");
       //Mostramos los números introducidos
       System.out.println("Esta es la matriz introducida:");
       
       System.out.println("");
       System.out.println("MATRIZ A");
       System.out.println("-----------");
      
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                 System.out.print(matrizA[i][j]+" ");
            }   
            System.out.println();
       }
        System.out.println();
        
        //Llamamos al método de la Matriz Adjunta
        mAdjunta(matrizA);
    }
    
    public static void llenarMatriz(int m[][]){
        for(int i=0; i<m.length;i++){
            for(int j=0; j<m[i].length;j++)
                m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el dato en la posicion ["+(i+1)+"]"+"["+(j+1)+"]"));
        }
    }

    public static void imprimirfilas (int m[][]){
        for (int[] m1 : m) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(m1[j] + "\t");
            }
            System.out.println();
        }   
    }

    public static void sumafilas( int cuadrado[][],int arreglo[]){
        for(int i=0; i<cuadrado.length;i++){
            int sumaXFilas = 0; 
            for(int j=0;j<cuadrado.length; j++){
                sumaXFilas= sumaXFilas+cuadrado[i][j];
                arreglo[i+2]= sumaXFilas;
            }
        }
    System.out.print("\n");
    }

    public static void sumaXcolumnas(int cuadrado[][],int arreglo[]){
        for(int j=0;j<cuadrado.length; j++){
            int sumaXColumnas = 0;
            for (int[] cuadrado1 : cuadrado) {
                sumaXColumnas = sumaXColumnas + cuadrado1[j];
                arreglo[j+(cuadrado.length+2)]=sumaXColumnas;
            }
        }
    System.out.print("\n");
    }

    public static void diagonalPrincipal(int cuadrado[][], int arreglo[]){
        int diagonalPrin = 0;
        for(int i=0;i<cuadrado.length; i++){
            for(int j=0;j<cuadrado.length; j++){
                if(i==j){
                    diagonalPrin += cuadrado[i][j];
                }
            }
        arreglo[0]=diagonalPrin;
        }
    System.out.println("  ");
    }

    public static void diagonalSecundaria(int cuadrado[][], int arreglo[]){
        int diagonalSec = 0;
        for(int i=0;i<cuadrado.length; i++){
            for(int j=0;j<cuadrado.length; j++){
                if(i+j==cuadrado.length-1){
                    diagonalSec += cuadrado[i][j];
                }
            }
            arreglo[1]=diagonalSec;
        }
        System.out.println("  ");
    }

    public static void inicializarArreglo(int pocicion[]){
        for(int i=0;i<pocicion.length;i++){
            pocicion[i]=0;
        }
    }

    public static void comprobacion(int arreglo[]){
        int comparacion=0;
        int copiaA[]=new int [arreglo.length];
        
        for(int i=0;i<arreglo.length;i++)
            copiaA[i]=arreglo[0];
            for(int j=0;j<copiaA.length;j++){
                if(copiaA[j]==arreglo[j]){
                    comparacion++;
                }
            }

            if(comparacion==copiaA.length){
                JOptionPane.showMessageDialog(null,"Si es un cuadrado magico");
            } else if(comparacion<copiaA.length){
                JOptionPane.showMessageDialog(null,"No es un cuadrado magico");
            }
    }

    public static void matrizMagica() {
        int tamaño;
        tamaño= Integer.parseInt(JOptionPane.showInputDialog( "Ingrese el tamaño de la matriz"));

        if(tamaño>0){
            int cuadrado [][] =new int[tamaño][tamaño]; 
            int arregloSumas[]=new int [tamaño*2+2];
            llenarMatriz(cuadrado);
            imprimirfilas(cuadrado);
            sumafilas(cuadrado,arregloSumas);
            sumaXcolumnas(cuadrado,arregloSumas);
            diagonalPrincipal(cuadrado,arregloSumas);
            diagonalSecundaria(cuadrado,arregloSumas);
            comprobacion(arregloSumas);
        } else {
            JOptionPane.showMessageDialog(null, "Error en el tamaño del cuadrado");
            System.exit(0);
        }
    }
    
    public static int[][] generarCaracol(int n, int x) {
        int[][] M = new int[n + 1][n + 1];
        for (int a = 1; a <= n / 2; a++) {
            for (int i = a; i <= n - a; i++) {
                M[a][i] = x;
                x++;
            }
            for (int i = a; i <= n - a; i++) {
                M[i][n - a + 1] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[n - a + 1][i] = x;
                x++;
            }
            for (int i = n - a + 1; i >= a + 1; i--) {
                M[i][a] = x;
                x++;
            }
        }
        if (n % 2 == 1) {
            M[n / 2 + 1][n / 2 + 1] = x;
        }
        return M;
    }
    
    public static void mostrarMatriz(int[][] M, int f, int c) {
        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + M[i][j]);
            }
            System.out.println();
        }
    }
    
    public static void matrizCaracol() {
        Scanner in = new Scanner(System.in);
        System.out.print("Dimesión De La Matriz: ");
        int n = in.nextInt();
        mostrarMatriz(generarCaracol(n, 1), n, n);
    }

    public static void matrizInversa() {
        
        Scanner entrada=new Scanner(System.in);
        
        double determinante,x00,x01,x02,x10,x11,x12,x20,x21,x22;
        
        double [][]B=new double [3][3];
        
        double [][]C=new double [3][3];
        
        System.out.println("Ingrese los valores de la matriz :");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=entrada.nextByte();
            }
        }
        System.out.println();
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("|"+ B[i][j] +"|");
            }
            System.out.println();
        }
        
        determinante=(B[0][0]*((B[1][1]*B[2][2])-(B[1][2]*B[2][1])))-(B[0][1]*((B[1][0]*B[2][2])-(B[2][0]*B[1][2])))+(B[0][2]*((B[1][0]*B[2][1])-(B[2][0]*B[1][1])));
        System.out.println();
        System.out.println("Determinate:" + determinante);
        System.out.println();
        
        if(determinante!=0){
            x00=((B[1][1]* B[2][2] - B[2][1]* B[1][2]))/determinante;
            x01=(-(B[1][0]* B[2][2] - B[2][0]* B[1][2]))/determinante;
            x02=((B[1][0]* B[2][1] - B[2][0]* B[1][1]))/determinante;
            x10=(-(B[0][1]* B[2][2] - B[2][1]* B[0][2]))/determinante;
            x11=((B[0][0]* B[2][2] - B[2][0]* B[0][2]))/determinante;
            x12=(-(B[0][0]* B[2][1] - B[2][0]* B[0][1]))/determinante;
            x20=((B[0][1]* B[1][2] - B[1][1]* B[0][2]))/determinante;
            x21=(-(B[0][0]* B[1][2] - B[1][0]* B[0][2]))/determinante;
            x22=((B[0][0]* B[1][1] - B[1][0]* B[0][1] ))/determinante;
            
            C[0][0]=x00;
            C[0][1]=x10;
            C[0][2]=x20;
            C[1][0]=x01;
            C[1][1]=x11;
            C[1][2]=x21;
            C[2][0]=x02;
            C[2][1]=x12;
            C[2][2]=x22;
            
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print("|"+ C[i][j] +"|");
                }
                System.out.println();
            } 
        }
        else{
            System.out.print("Error la matriz no tiene inversa");
        }
    }
    
    static void cambioColumna(int [][] a){
        
        int[][] matriz = a;
        int cont=1;
        
        int[] aux= new int[5];
        int[] auxU= new int[5];
        
        for(cont=0; cont<5; cont++){
            auxU[cont]= matriz[cont][4];
        }
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = fila; col > 0; col--){ 
		matriz[fila][col]= matriz[fila][col-1];
                } 
        }
        
        for(cont=0; cont<5; cont++){
            matriz[cont][0]= auxU[cont];
        }
        
        for(cont=0; cont<5; cont++){
            aux[cont]= matriz[cont][1];
        }
        
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = 1; col < fila; col++){ 
		matriz[fila][col]= matriz[fila][col+1];
                } 
        }
        
        for(cont=0; cont<5; cont++){
            matriz[cont][4]= aux[cont];
        }
        
        
        System.out.println();
        System.out.println("Matriz intercambiada");
        System.out.println();
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = 0; col < matriz[fila].length; col++){ 
		System.out.print(matriz[fila][col] + "\t");
                } 
            System.out.println();
        
        }
}

    static void PriUltColumna() {
         int[][] matriz = new int [5][5];
        int cont=1;
        
        for(int fila=0; fila<matriz.length; fila++){
            for(int col=0; col<matriz[fila].length; col++){
                matriz[fila][col]= cont;
                cont++;
            }
        }
        
        System.out.println("Matriz original");
        for(int fila = 0; fila < matriz.length; fila++){ 
            for(int col = 0; col < matriz[fila].length; col++){ 
		System.out.print(matriz[fila][col] + "\t");
                } 
            System.out.println();
        
        }
        
    cambioColumna(matriz);
    }
    
    static void Filas(int matriz[][], int filas, int col){
        int [] B = new int[filas];
        int sumaFilas=0;
        for (int i = 0; i < filas; i++) {
            for (int x = 0; x < col; x++) {
                if (x < col) {
                    sumaFilas += matriz[i][x];
                }
            }
            B[i]=sumaFilas;
            sumaFilas = 0;
        }
        System.out.println("Suma de las Filas");
        for(int i = 0; i < B.length; i++){ 
                System.out.print(B[i] + " ");
                System.out.println();
        }
        System.out.println();
    }
    
    static void Columnas(int matriz[][], int filas, int col){
        int [] C = new int[col];
        int sumaCol=0;
        for(int i=0; i<col; i++){
            for(int x=0; x<filas; x++){
                if(x<filas){   
                    sumaCol += matriz [x][i];
                }   
            }
            C[i]=sumaCol;
            sumaCol = 0;   
        }   
        System.out.println("Suma de las Columnas");
        for(int i = 0; i < C.length; i++){ 
                System.out.print(C[i] + " ");
        }
        System.out.println();
    }
    
    static void sumarFilasColumnas() {
        Scanner sc = new Scanner(System.in);
        int [][]A;
        int filas, colum;
        
        System.out.println("Ingrese las filas de la matriz");
        filas=sc.nextInt();
        System.out.println("Ingrese las columnas de la matriz?");
        colum=sc.nextInt();
        A=new int [filas][colum];
        
        for(int i=0; i<filas; i++){
            for (int x=0; x<colum; x++){
                System.out.println("Ingrese los datos de la posición ["+i+"]["+x+"]");
                A[i][x]=sc.nextInt();
            }
        } 
        System.out.println();
        System.out.println("Matriz: ");
        for (int[] A1 : A) {
            for (int j = 0; j < A1.length; j++) {
                System.out.print(A1[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        Filas(A, filas, colum);
        Columnas(A, filas, colum);
    }
}
