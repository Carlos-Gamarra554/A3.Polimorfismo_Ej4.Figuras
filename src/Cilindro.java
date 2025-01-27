public class Cilindro extends Forma{
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radio * (radio + altura);
    }

    public String toString() {
        return "Figura: cilindro\n" +
                "Radio: " + radio + "cm, altura: " + altura + "cm";
    }
}
