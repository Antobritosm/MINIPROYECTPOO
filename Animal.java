package PROYECTPOO;

public abstract class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String estado; 

    public Animal(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = "ACTIVO"; //Los animales inician activos en el refugio
    }

    // Metodos que van a heredarán las clases hijas
    public abstract void hacerSonido();
    public abstract void mostrarAccion();

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Edad: " + edad + " años | Estado: " + estado;
    }
}