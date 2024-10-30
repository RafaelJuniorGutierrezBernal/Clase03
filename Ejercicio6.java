public class Ejercicio6 {

    public static void main(String[] args) {
     
        var PrecioPagado = 34;
        var Descuento = 0.15;
        var PrecioSinDescuento = PrecioPagado / (1 - Descuento);
        System.out.println("Precio sin descuento: " + PrecioSinDescuento);
        // el precio sin descuento es: 40.0

    }
    
}
