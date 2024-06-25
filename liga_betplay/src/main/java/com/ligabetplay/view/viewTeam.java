package com.ligabetplay.view;

import java.util.Enumeration;
import java.util.Scanner;

import com.ligabetplay.Controller;
import com.ligabetplay.models.Team;

public class viewTeam {
    public static Controller controlador;
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar todos Equipos");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    Team equipo = new Team();
                    System.out.println("Ingrese el codigo del equipo :");
                    String codigoEquipo = scanner.nextLine();
                    System.out.println("Ingrese Nombre del equipo :");
                    equipo.setNombre(scanner.nextLine());
                    System.out.println("Ingrese la ciudad :");
                    equipo.setCiudad(scanner.nextLine());
                    controlador.equipos.put(codigoEquipo, equipo);
                }

                case 2 -> {
                    System.out.println("Actualizando...");
                }

                case 3 -> {
                    Team eq = new Team();
                    String codigoE = "001";
                    eq = controlador.equipos.get(codigoE);
                    System.out.println("Mi equipo" + eq.getNombre());
                }
                case 4 -> {
                    String codigoE = "002";
                    controlador.equipos.remove(codigoE);
                }
                case 5 -> {
                    Enumeration<String> e = controlador.equipos.keys();

                    while (e.hasMoreElements()) {
                        String key = e.nextElement();
                        System.out.println(controlador.equipos.get(key));
                    }
                }

                case 6 -> {
                    scanner.close();
                    break;
                }

                default -> System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}
