package com.ejemplo;

/**
 * Esta clase contiene funciones para operar con arreglos enteros.
 */
public class FuncionesADocumentar {
    /**
     * Creamos un array con 15 elementos para hacer unas pruebas.
     * @param args
     */
    public static void main(String[] args) {
        
        int a[] = {7, 14, 9, 18, 11, 6, 13, 12, 1, 5, 4, 3, 2, 8, 10};

        System.out.println("La suma de los elementos del arreglo es: " + suma(a));
        System.out.println("El promedio de los elementos del arreglo es: " + promedio(a));
        System.out.println("El mayor de los elementos del arreglo es: " + mayor(a));
        System.out.println("El menor de los elementos del arreglo es: " + menor(a));
        System.out.println("El arreglo invertido es: ");
        invertir(a);
        System.out.println("El arreglo ordenado es: ");
        ordenar(a);
    }
    /**
     * Calcula la suma total de todos los numeros.
     * @param a
     * @return devuelve la suma total de los enteros.
     */
    public static int suma(int a[]) {
        int suma = 0;
        for (int i = 0; i < a.length; i++)
            suma += a[i];
        return suma;
    }
    /**
     * Calcula el promedio de los numeros.
     * @param a
     * @return promedio de los elementos.
     */
    public static double promedio(int a[]) {
        return suma(a) / a.length;
    }
    /**
     * Devuelve el mayor de los numeros.
     * @param a
     * @return Devuelve el elemento mayor.
     */
    public static int mayor(int a[]) {
        int mayor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > mayor)
                mayor = a[i];
        return mayor;
    }
    /**
     * Devuelve el menor de los numeros.
     * @param a
     * @return Devuelve el elemento menor.
     */
    public static int menor(int a[]) {
        int menor = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < menor)
                menor = a[i];
        return menor;
    }
    /**
     * Invierte el orden de los elementos del array.
     * @param a
     */
    public static void invertir(int a[]) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    /**
     * Ordena los elementos del array de mayor a menor.
     * @param a
     */
    public static void ordenar(int a[]) {
        int aux;
        for (int i = 0; i < a.length - 1; i++)
            for (int j = i; j < a.length; j++)
                if (a[i] > a[j]) {
                    aux = a[i];
                    a[i] = a[j];
                    a[j] = aux;
                }
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

}
