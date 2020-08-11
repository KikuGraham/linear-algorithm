import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa que suma 2 números");
        // defino variables
        int firstNumber;
        int secondsNumber;
        int result;

        //Habilito el ingreso de deatos por el teclado
        Scanner keyboard = new Scanner(System.in);

        //leo los datos del usuario
        System.out.print("Ingrese el primer número para el calculo: ");
        firstNumber = keyboard.nextInt();
        System.out.print("Ingrese el segundo número para el calculo: ");
        secondsNumber = keyboard.nextInt();

        //realizo el proceso y lo guardo en la variable result

        result = firstNumber + secondsNumber;

        //muestro el resulatdo por pantalla
        System.out.println("El resultado es: " + result);

    }
}
