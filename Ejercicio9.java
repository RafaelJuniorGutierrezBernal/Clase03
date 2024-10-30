import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
       
        var scanner = new Scanner(System.in);
        System.out.println("Digite la temperatura en celcius: ");
        var celcius = scanner.nextDouble();
        
        var Fahrenheint = celcius * 9 / 5 + 32;
        System.out.println("La temperatura en Fahrenheint es: " + Fahrenheint);

        var kelvin = celcius + 273.15;
        System.out.println("La temperatura en kelvin es: " + kelvin);


        scanner.close();
    }
}
