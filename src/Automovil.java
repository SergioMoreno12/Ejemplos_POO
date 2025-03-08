// Subclase
public class Automovil extends Vehiculo {
    private int numeroDePuertas;

    public Automovil(String marca, String modelo, int numeroDePuertas) {
        super(marca, modelo);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Número de puertas: " + numeroDePuertas);
    }
}
