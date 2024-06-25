package com.ligabetplay.view;

import java.util.Enumeration;
import java.util.Scanner;

import com.ligabetplay.Controller;
import com.ligabetplay.models.Coach;

public class viewCoach {
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
                    Coach coach = new Coach();;
                    System.out.println("Ingrese el codigo del coach :");
                    int codigoCoach = scanner.nextInt();
                    coach.setId(codigoCoach);
                    System.out.println("Ingrese Nombre del coach :");
                    coach.setNombre(scanner.nextLine());
                    System.out.println("Ingrese el apellido :");
                    coach.setApellido(scanner.nextLine());
                    System.out.println("Ingrese la edad :");
                    coach.setEdad(scanner.nextInt());
                    System.out.println("Ingrese el id de federacion :");
                    coach.setIdFederacion(scanner.nextInt());

                    controlador.coachs.put(String.valueOf(codigoCoach), coach);
                }

                case 2 -> {
                    System.out.println("Actualizando...");
                }

                case 3 -> {
                    Coach coach = new Coach();
                    String codigoC = "001";
                    coach = controlador.coachs.get(codigoC);
                    System.out.println("Mi equipo" + coach.getNombre());
                }
                case 4 -> {
                    String codigoE = "002";
                    controlador.coachs.remove(codigoE);
                }
                case 5 -> {
                    Enumeration<String> e = controlador.coachs.keys();

                    while (e.hasMoreElements()) {
                        String key = e.nextElement();
                        System.out.println(controlador.coachs.get(key));
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