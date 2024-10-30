import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {

        var scanner = new Scanner (System.in);
        System.out.println("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        var Suma = num1 + num2;
        System.out.println("La suma de los dos números es: \n" + Suma);

        var Multiplicacion = num1 * num2;
        System.out.println("La multiplicación de los dos números es: \n" + Multiplicacion);

        var Resta = num1 - num2;
        System.out.println("La resta de los dos números es: \n" + Resta);

        var Division = num1 / num2;
        System.out.println("La division de los dos números es: \n" + Division);



        System.out.println("Gracias por usar este programa");
        scanner.close();
    }
    
}
