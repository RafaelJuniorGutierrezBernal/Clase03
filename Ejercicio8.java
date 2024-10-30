import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("ingrese la longitud del rectangulo: ");
        var longitud = scanner.nextDouble();
        System.out.println("ingrese la anchura del rectangulo: ");
        var anchura = scanner.nextDouble();

        var area = longitud * anchura;
        System.out.println("el area del rectangulo es: " + area);

        var perimetro = 2 * (longitud + anchura);
        System.out.println("el perimetro del rectangulo es: " + perimetro);

        scanner.close();
    }    
}