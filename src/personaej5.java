public class personaej5 {
    private String nombre;
    private int edad;


    public personaej5() {}

    @Override
    public String toString() {
        return '{' +
                nombre + '-' +
                 edad +
                '}';
    }

    public personaej5(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
