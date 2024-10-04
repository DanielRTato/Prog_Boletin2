package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // tarea 1

        double baseT, alturaT, areaT;

        baseT = 4;
        alturaT = 3;
        areaT = baseT * alturaT / 2;

        System.out.println("El area del triangulo es " + areaT);


        // tarea 2
        double ladoC, areaC;

        ladoC = 3;
        areaC = ladoC * ladoC;

        System.out.println("El area del cuadrado es " + areaC);

        // tarea 3
        double cambio, euros, dolares;
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        System.out.println("Rate de cambio?");
        cambio = entradaTeclado.nextDouble();
        System.out.println("Cantidad de euros? ");
        euros = entradaTeclado.nextDouble();
        dolares = euros / cambio;
        System.out.println(dolares + " Dolares de cambio, por " + euros + " Euros.");


        // tarea 4
      /*  double num1, num2, resultado;
        Scanner eligeNumero;
        eligeNumero =  new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1 = eligeNumero.nextDouble();
        num2 = eligeNumero.nextDouble();
        System.out.println("Introduce el segundo numero");
        resultadoS = num1 + num2;d
*/


        int p = 55555;
        int o = 66666;
        long num3;
        System.out.println(p + o);


    }

    }

