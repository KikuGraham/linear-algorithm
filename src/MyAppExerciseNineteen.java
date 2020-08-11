import java.util.Scanner;
//Ejercicio 19.
//La secretaria de salud requiere un diagrama de flujo que le represente el
//algoritmo que permita determinar qué tipo de vacuna (A, B o C) debe
//aplicar a una persona, considerando que si es mayor de 70 años, sin
//importar el sexo, se le aplica la tipo C; si tiene entre 16 y 69 años, y es
//mujer, se le aplica la B, y si es hombre, la A; si es menor de 16 años, se
//le aplica la tipo A, sin importar el sexo.

public class MyAppExerciseNineteen {
    public static void main(String[] args) {
        int age;
        String sex;
        String vaccineType = null;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Edad: ");
        age = keyboard.nextInt();

        System.out.println("Ingrese genero:\n 'F' para femenino:\n 'M' para masculino:\n ");
        sex = keyboard.next();

        if (age >= 70) {
            vaccineType = "C";
        }
        if (age > 15 && age < 70) {
            if (sex.equals("F")) {
                vaccineType = "B";
            } else {
                vaccineType = "A";
            }
        }
        if (age < 16) {
            vaccineType = "A";
        }
        System.out.println("La vacuna que se debe aplicar es: Tipo " + vaccineType);

    }
}
