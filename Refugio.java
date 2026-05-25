package PROYECTPOO;

import java.util.ArrayList;

public class Refugio {
    private ArrayList<Animal> listaAnimales;

    public Refugio() {
        this.listaAnimales = new ArrayList<>();
    }

    public void registrarAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println("Confirmacion: " + animal.getNombre() + " ha sido registrado exitosamente.");
    }

    public void mostrarAnimales() {
        if (listaAnimales.isEmpty()) {
            System.out.println("El refugio no tiene animales registrados.");
            return;
        }
        System.out.println("\n--- LISTA DE ANIMALES EN EL REFUGIO ---");
        for (Animal a : listaAnimales) {
            System.out.println(a.toString());
        }
    }

    public Animal buscarAnimalPorId(int id) {
        for (Animal a : listaAnimales) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public boolean cambiarEstadoAnimal(int id, String nuevoEstado) {
        Animal animal = buscarAnimalPorId(id);
        if (animal != null) {
            animal.setEstado(nuevoEstado.toUpperCase());
            return true;
        }
        return false;
    }
}