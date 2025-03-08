//abstract class Animal {
    // Metodo abstracto (sin implementación, debe ser sobrescrito)
    //abstract void hacerSonido();
//}

//class Perro extends Animal {
    // Sobrescritura del metodo abstracto de Animal
    //@Override
    //void hacerSonido() {
        //System.out.println("Guau!");
    //}
//}

public class EjemploMetodos {

    // 2. Metodo constructor
    private String nombre;

    public EjemploMetodos(String nombre) {
        this.nombre = nombre;
    }

    // 3. Metodos de acceso (Getters y Setters)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 4. Metodo de instancia (requiere un objeto)
    public void metodoInstancia() {
        System.out.println("Este es un método de instancia.");
    }

    // 5. Metodo estático (pertenece a la clase)
    public static void metodoEstatico() {
        System.out.println("Este es un método estático.");
    }

    // 6. Metodo con retorno
    public int sumar(int a, int b) {
        return a + b;
    }

    // 7. Metodo void (sin retorno)
    public void imprimirMensaje() {
        System.out.println("Hola, mundo!");
    }

    // 8. Metodo sobrecargado (mismo nombre, diferentes parámetros)
    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    // 9. Metodo final (no puede ser sobrescrito por subclases)
    public final void metodoFinal() {
        System.out.println("Este es un método final.");
    }

    // 10. Metodos con diferentes niveles de acceso
    private void metodoPrivado() {
        System.out.println("Método privado.");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido.");
    }

    void metodoPorDefecto() { // Acceso "default"
        System.out.println("Método con acceso por defecto.");
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase EjemploMetodos
        EjemploMetodos objeto = new EjemploMetodos("Juan");

        // Llamando a metodos de instancia
        objeto.metodoInstancia();
        System.out.println("Nombre: " + objeto.getNombre());

        // Llamando a metodo estático
        metodoEstatico();

        // Uso de métodos con retorno
        int resultadoSuma = objeto.sumar(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        // Uso de metodo void
        objeto.imprimirMensaje();

        // Uso de sobrecarga de métodos
        System.out.println("Multiplicación (int): " + objeto.multiplicar(4, 2));
        System.out.println("Multiplicación (double): " + objeto.multiplicar(4.5, 2.3));

        // Uso de metodo final
        objeto.metodoFinal();

        // Metodos con diferentes modificadores de acceso
        objeto.metodoProtegido();
        objeto.metodoPorDefecto();

        // Crear un objeto de la clase Perro (implementación de un metodo abstracto)
        //Perro miPerro = new Perro();
        //miPerro.hacerSonido();
    }
}


