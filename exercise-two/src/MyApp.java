import java.util.Locale;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
        //example get string
        double amountMexicanPesos, dollarAmount;
        final double DOLLAR_PRICE = 22.37;

        Scanner keyboard = new Scanner(System.in);
        // keyboard.useLocale(new Locale("es", "AR"));
        //keyboard.useLocale(Locale.US);
        /*Se puede configirar si será con punto "." o coma ","
        o el sisteam toma el que viene por defecto, en este caso coma ","
         */

        System.out.print("Cantidad de pesos Mexicanos a convertir: ");
        amountMexicanPesos = keyboard.nextDouble();
        dollarAmount = amountMexicanPesos/DOLLAR_PRICE;
        System.out.println(dollarAmount);
    }
}
