/**
 * Created by emanu on 07/06/2017.
 */
public class Circulo implements AreaCalculavel {

    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * raio * raio;
    }
}
