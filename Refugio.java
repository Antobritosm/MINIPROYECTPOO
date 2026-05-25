package PROYECTPOO;

import java.util.ArrayList;

public class Refugio {
    private ArrayList<Animal> listaAnimales;

    // Constructor 
    public Refugio() {
        this.listaAnimales = new ArrayList<>();
    }

    // Operación para registrar un animal 
    public void registrarAnimal(Animal animal) {
        listaAnimales.add(animal);
        System.out.println("✅ " + animal.getNombre() + " ha sido registrado exitosamente en el refugio.");
    }

    // Operación para mostrar todos los animales almacenados
    public void mostrarAnimales() {
        if (listaAnimales.isEmpty()) {
            System.out.println("📭 El refugio no tiene animales registrados en este momento.");
            return;
        }
        System.out.println("\n--- LISTA DE ANIMALES EN EL REFUGIO ---");
        for (Animal a : listaAnimales) {
            System.out.println(a.toString());
        }
    }

    // Operación para buscar un animal específico por su ID
    public Animal buscarAnimalPorId(int id) {
        for (Animal a : listaAnimales) {
            if (a.getId() == id) {
                return a; 
            }
        }
        return null;
    }

    //Cambiar el estado de un animal
    public boolean cambiarEstadoAnimal(int id, String nuevoEstado) {
        Animal animal = buscarAnimalPorId(id);
        if (animal != null) {
            animal.setEstado(nuevoEstado.toUpperCase());
            return true; 
        }
        return false; 
    }
}