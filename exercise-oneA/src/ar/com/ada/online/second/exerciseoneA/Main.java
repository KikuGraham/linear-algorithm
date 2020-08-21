package ar.com.ada.online.second.exerciseoneA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

     //Se establecen las variables
        double length, height, area;

        //Se habilita el teclado
        Scanner keyboard = new Scanner(System.in);

        //Solicita datos
        System.out.print("Ingrese la longitud del rectangulo: ");
        length = keyboard.nextDouble();

        //Solicita datos
        System.out.print("Ingrese la altura del rectangulo: ");
        height = keyboard.nextDouble();

        area = (height * length) /2;

        //Muestra el resultado
        System.out.println("Area del triangulo: "+ area);

    }
}
