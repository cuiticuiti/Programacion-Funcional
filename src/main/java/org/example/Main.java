package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        solveAlumnos();
        System.out.println("-----");
        solveProductos();
        System.out.println("-----");
        solveLibros();
        System.out.println("-----");
        solveEmpleados();
    }

    private static void solveAlumnos() {
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Ana", 8.5, "A"),
                new Alumno("Juan", 6.0, "B"),
                new Alumno("María", 9.0, "A"),
                new Alumno("Pedro", 7.0, "C"),
                new Alumno("Lucía", 8.0, "B")
        );
        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7.0)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Aprobados: " + aprobados);
    }

    private static void solveProductos() {
        List<Producto> productos = Arrays.asList(
                new Producto("Perfume A", "Fragancia", 150.0, 10),
                new Producto("Jabón", "Higiene", 50.0, 30),
                new Producto("Perfume B", "Fragancia", 250.0, 5),
                new Producto("Loción", "Fragancia", 120.0, 8),
                new Producto("Shampoo", "Higiene", 130.0, 12)
        );
        productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .forEach(System.out::println);
    }

    private static void solveLibros() {
        List<Libro> libros = Arrays.asList(
                new Libro("El gran libro", "Autor A", 320, 45.0),
                new Libro("Pequeñas historias", "Autor B", 210, 30.0),
                new Libro("Ciencia avanzada", "Autor A", 420, 80.0),
                new Libro("Novela X", "Autor C", 350, 55.0)
        );
        libros.stream()
                .filter(l -> l.getPaginas() > 300)
                .map(Libro::getTitulo)
                .sorted()
                .forEach(System.out::println);
    }

    private static void solveEmpleados() {
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Sofía", "Ventas", 2500.0, 28),
                new Empleado("Carlos", "TI", 1800.0, 35),
                new Empleado("Marta", "Ventas", 3000.0, 24)
        );
        empleados.stream()
                .filter(e -> e.getSalario() > 2000)
                .forEach(System.out::println);
    }
}
