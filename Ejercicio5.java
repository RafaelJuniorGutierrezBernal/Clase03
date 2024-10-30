public class Ejercicio5 {
    public static void main(String[] args) {
        
        var PrecioOrdenador = 660;
        var Descuento = 0.10;
        var PrecioDescuento = PrecioOrdenador * Descuento;
        var PrecioFinal = PrecioOrdenador - PrecioDescuento;
        
        System.out.println("Precio final: " + PrecioFinal);
        //el precio final del ordenador es: 594.0 euros
    }
}
