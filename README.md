# Mini-Proyecto: Sistema de Refugio de Animales

**Estudiante:** Antonela Brito  
**Docente:** Jhonatan Torres  
**Bootcamp:** Programacion Cero a POO  
**Bloque:** Java POO  

## 1. Descripcion del Proyecto
Este es un sistema de consola desarrollado en Java disenado para gestionar un pequeno refugio de animales. El proposito del programa es aplicar de forma integrada los pilares fundamentales de la Programacion Orientada a Objetos (POO) en un nivel inicial, tales como el encapsulamiento, la herencia y el polimorfismo, estructurando el codigo de manera limpia y evitando centralizar la logica en una sola clase.

## 2. Estructura de Clases
El proyecto se encuentra organizado bajo las siguientes clases fundamentales:
- **Animal.java**: Clase base abstracta que contiene los atributos generales (id, nombre, edad, estado) y define los metodos abstractos para el comportamiento polimorfico.
- **Perro.java**: Subclase que hereda de Animal y sobrescribe los metodos de comportamiento especificos para un canino.
- **Gato.java**: Subclase que hereda de Animal y sobrescribe los metodos de comportamiento especificos para un felino.
- **Refugio.java**: Clase gestora encargada de administrar la coleccion dinamica (ArrayList), abstrayendo la logica de registro, listado, busqueda por ID y modificacion de estados.
- **Main.java**: Clase principal encargada unicamente de controlar el menu interactivo en consola, la captura de datos por teclado y el manejo basico de excepciones.

## 3. Instrucciones de Compilacion y Ejecucion
Para compilar y ejecutar el proyecto de forma correcta desde la terminal de comandos, asegurese de estar dentro del directorio src/PROYECTPOO y ejecute:

### Compilacion:
javac *.java

### Ejecucion:
java Main
