package com.ligabetplay.view;

import java.util.Enumeration;
import java.util.Scanner;

import com.ligabetplay.Controller;
import com.ligabetplay.models.Doctor;

public class viewDoctor {
    public static Controller controlador;
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Doctor :");
            System.out.println("2. Actualizar Doctor :");
            System.out.println("3. Buscar Doctor :");
            System.out.println("4. Eliminar Doctor :");
            System.out.println("5. Listar todos Doctor :");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    Doctor doctor = new Doctor();
                    System.out.println("Ingrese el codigo del doctor :");
                    int codigoDoctor = scanner.nextInt();
                    doctor.setId(codigoDoctor);
                    System.out.println("Ingrese Nombre del doctor :");
                    doctor.setNombre(scanner.nextLine());
                    System.out.println("Ingrese el apellido :");
                    doctor.setApellido(scanner.nextLine());
                    System.out.println("Ingrese la edad :");
                    doctor.setEdad(scanner.nextInt());
                    System.out.println("Ingrese el dorsal :");
                    doctor.setTitulo(scanner.nextLine());
                    System.out.println("Ingrese el posicion :");
                    doctor.setExpYear(scanner.nextInt());

                    controlador.doctors.put(String.valueOf(codigoDoctor), doctor);
                }

                case 2 -> {
                    System.out.println("Actualizando...");
                }

                case 3 -> {
                    Doctor doctor = new Doctor();
                    String codigoD = "001";
                    doctor = controlador.doctors.get(codigoD);
                    System.out.println("Mi equipo" + doctor.getNombre());
                }
                case 4 -> {
                    String codigoE = "002";
                    controlador.doctors.remove(codigoE);
                }
                case 5 -> {
                    Enumeration<String> e = controlador.doctors.keys();

                    while (e.hasMoreElements()) {
                        String key = e.nextElement();
                        System.out.println(controlador.doctors.get(key));
                    }
                }

                case 6 -> {
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}
