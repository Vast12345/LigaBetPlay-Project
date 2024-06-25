package com.ligabetplay.view;

import java.util.Enumeration;
import java.util.Scanner;

import com.ligabetplay.Controller;
import com.ligabetplay.models.Player;

public class viewPlayer {
    public static Controller controlador;
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Player");
            System.out.println("2. Actualizar Player");
            System.out.println("3. Buscar Player");
            System.out.println("4. Eliminar Player");
            System.out.println("5. Listar todos Player");
            System.out.println("6. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    Player player = new Player();
                    System.out.println("Ingrese el codigo del player :");
                    int codigoPlayer = scanner.nextInt();
                    player.setId(codigoPlayer);
                    System.out.println("Ingrese Nombre del player :");
                    player.setNombre(scanner.nextLine());
                    System.out.println("Ingrese el apellido :");
                    player.setApellido(scanner.nextLine());
                    System.out.println("Ingrese la edad :");
                    player.setEdad(scanner.nextInt());
                    System.out.println("Ingrese el dorsal :");
                    player.setDorsal(scanner.nextInt());
                    System.out.println("Ingrese el posicion :");
                    player.setPosicion(scanner.nextLine());

                    controlador.players.put(String.valueOf(codigoPlayer), player);
                }

                case 2 -> {
                    System.out.println("Actualizando...");
                }

                case 3 -> {
                    Player player = new Player();
                    String codigoP = "001";
                    player = controlador.players.get(codigoP);
                    System.out.println("Mi equipo" + player.getNombre());
                }
                case 4 -> {
                    String codigoE = "002";
                    controlador.players.remove(codigoE);
                }
                case 5 -> {
                    Enumeration<String> e = controlador.players.keys();

                    while (e.hasMoreElements()) {
                        String key = e.nextElement();
                        System.out.println(controlador.players.get(key));
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
