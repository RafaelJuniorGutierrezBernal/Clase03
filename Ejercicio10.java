import java.util.Scanner;
public class Ejercicio10 {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);
        
            System.out.println("Digite el primer número: ");
            var num1 = scanner.nextDouble();

            System.out.println("Digite el segundo número: ");
            var num2 = scanner.nextDouble();

            System.out.println("Digite el tercer número: ");
            var num3 = scanner.nextDouble();

            var MediaAritmetica = (num1 + num2 + num3) / 3;
            System.out.println("La media aritmetica es: " + MediaAritmetica);
            



        scanner.close();

    }
    
}
