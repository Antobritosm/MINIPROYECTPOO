package PROYECTPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Refugio miRefugio = new Refugio();
        boolean salir = false;

        // Contador para generar IDS
        int contadorId = 1; 

        System.out.println("-BIENVENIDOS AL SISTEMA DEL REFUGIO-");

        while (!salir) {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Registrar perro");
            System.out.println("2. Registrar gato");
            System.out.println("3. Mostrar animales");
            System.out.println("4. Buscar animal por ID");
            System.out.println("5. Cambiar estado de un animal");
            System.out.println("6. Ejecutar acción o sonido de un animal");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            try {

                int opcion = Integer.parseInt(entrada.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del perro: ");
                        String nomPerro = entrada.nextLine();
                        System.out.print("Ingrese la edad del perro: ");
                        int edadPerro = Integer.parseInt(entrada.nextLine());

                        // Validacioon de edad
                        if (edadPerro < 0) {
                            System.out.println(" La edad no puede ser negativa.");
                        } else {
                            Perro nuevoPerro = new Perro(contadorId++, nomPerro, edadPerro);
                            miRefugio.registrarAnimal(nuevoPerro);
                        }
                        break;

                    case 2:
                        System.out.print("Ingrese el nombre del gato: ");
                        String nomGato = entrada.nextLine();
                        System.out.print("Ingrese la edad del gato: ");
                        int edadGato = Integer.parseInt(entrada.nextLine());

                        if (edadGato < 0) {
                            System.out.println(" La edad no puede ser negativa.");
                        } else {
                            Gato nuevoGato = new Gato(contadorId++, nomGato, edadGato);
                            miRefugio.registrarAnimal(nuevoGato);
                        }
                        break;

                    case 3:
                        miRefugio.mostrarAnimales();
                        break;

                    case 4:
                        System.out.print("Ingrese el ID del animal a buscar: ");
                        int idBuscar = Integer.parseInt(entrada.nextLine());
                        Animal animalEncontrado = miRefugio.buscarAnimalPorId(idBuscar);

                        if (animalEncontrado != null) {
                            System.out.println(" Animal encontrado: " + animalEncontrado.toString());
                        } else {
                            System.out.println("El ID ingresado no corresponde a ningún animal registrado.");
                        }
                        break;

                    case 5:
                        System.out.print("Ingrese el ID del animal a modificar: ");
                        int idEstado = Integer.parseInt(entrada.nextLine());
                        System.out.print("Ingrese el nuevo estado (ACTIVO / ADOPTADO): ");
                        String nuevoEstado = entrada.nextLine();

                        boolean modificado = miRefugio.cambiarEstadoAnimal(idEstado, nuevoEstado);
                        if (modificado) {
                            System.out.println(" Estado actualizado correctamente.");
                        } else {
                            System.out.println(" No se pudo cambiar el estado. El ID no existe.");
                        }
                        break;

                    case 6:
                        System.out.print("Ingrese el ID del animal para ver su acción: ");
                        int idAccion = Integer.parseInt(entrada.nextLine());
                        Animal animalAccion = miRefugio.buscarAnimalPorId(idAccion);

                        if (animalAccion != null) {
                            System.out.println("\n--- Demostración de Polimorfismo ---");
                            animalAccion.hacerSonido();  // El objeto responde según su tipo real
                            animalAccion.mostrarAccion(); // Comportamiento polimórfico
                        } else {
                            System.out.println(" Operación inválida. El animal no existe.");
                        }
                        break;

                    case 7:
                        salir = true;
                        System.out.println(" Saliendo del sistema. ¡Muchas gracias por cuidar a los animales!");
                        break;

                    default:
                        System.out.println(" Opción inválida. Por favor, seleccione un número del 1 al 7.");
                        break;
                }
            } catch (NumberFormatException e) {
                // Captura el error si el usuario ingresa campos vacíos
                System.out.println(" Error de entrada: Por favor, ingrese un número entero válido.");
            }
        }
        entrada.close();
    }
}