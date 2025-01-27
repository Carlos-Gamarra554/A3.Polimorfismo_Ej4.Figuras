public class Esfera extends Forma{
    private double radio;

    public Esfera(double radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public String toString() {
        return "Figura: esfera\n" +
                "Radio: " + radio + "cm";
    }
}
