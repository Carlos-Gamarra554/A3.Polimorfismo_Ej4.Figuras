public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura = new Pintura(250);
        Rectangulo rectangulo = new Rectangulo(20,35);
        Esfera esfera = new Esfera(15);
        Cilindro cilindro = new Cilindro(10,30);

        System.out.println("Cantidad de pintura necesaria para pintar el " + rectangulo.getNombre().toLowerCase()+ ": " + pintura.pintar(rectangulo) + " m2");
        System.out.println("Cantidad de pintura necesaria para pintar la " + esfera.getNombre().toLowerCase() + ": " + pintura.pintar(esfera) + " m2");
        System.out.println("Cantidad de pintura necesaria para pintar el " + cilindro.getNombre().toLowerCase() + ": " + pintura.pintar(cilindro) + " m2");
    }
}