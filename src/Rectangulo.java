public class Rectangulo extends Forma{
    private double longitud;
    private double ancho;

    public Rectangulo(double lado1, double lado2) {
        super("Rectangulo");
        this.longitud = lado1;
        this.ancho = lado2;
    }

    @Override
    public double area() {
        return longitud * ancho;
    }

    public String toString(){
        return "Figura: rectángulo\n " +
                "Longitud: " + longitud + "cm, ancho: " + ancho + "cm";
    }
}
