/**
 * Created by emanu on 07/06/2017.
 */
public class TesteCalculos {

    public static void main(String[] args) {

        AreaCalculavel n = new Retangulo(3,2);
        AreaCalculavel o = new Quadrado(2);
        AreaCalculavel c = new Circulo(2);

        System.out.println("retangulo: " + n.calculaArea());
        System.out.println("quadrado: " + o.calculaArea());
        System.out.println("circulo: " + c.calculaArea());

    }

}
