package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        short x;
        short z;
        short resta;
        short suma= 0;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Introduce el primer valor");
        x = entradaTeclado.nextShort();

        entradaTeclado = new Scanner(System.in);
        System.out.println("Introuce el segundo valor");
        z = entradaTeclado.nextShort();

        if (x >= z) {
            resta = (short) (x - z);
            System.out.println(resta);
        }
            else {
            suma = (short) (x + z);
        }
            System.out.println(suma);






    }
}