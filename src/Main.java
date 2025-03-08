public class Main {
    public static void main(String[] args) {
        // 1. Encapsulamiento: Uso de getters y setters
        Empleado empleado = new Empleado("Juan", 5000);
        System.out.println("Nombre del empleado: " + empleado.getNombre());
        System.out.println("Salario: " + empleado.getSalario());
        empleado.setSalario(6000);
        System.out.println("Nuevo salario: " + empleado.getSalario());

        System.out.println("\n---------------------------------\n");

        // 2. Herencia: Crear una instancia de Automovil
        Automovil miAuto = new Automovil("Toyota", "Corolla", 4);
        miAuto.acelerar(); // Metodo heredado de Vehiculo
        miAuto.mostrarDetalles(); // Metodo propio de Automovil

        System.out.println("\n---------------------------------\n");

        // 3. Polimorfismo: Diferentes implementaciones de un mismo metodo
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        miPerro.hacerSonido(); // Salida: El perro ladra.
        miGato.hacerSonido();  // Salida: El gato maúlla.

        System.out.println("\n---------------------------------\n");

        // 4. Abstracción: Uso de una clase abstracta
        Forma miCirculo = new Circulo(5);
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());
    }
}
