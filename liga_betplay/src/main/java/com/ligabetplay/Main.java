package com.ligabetplay;

import java.util.Scanner;

import com.ligabetplay.view.viewCoach;
import com.ligabetplay.view.viewDoctor;
import com.ligabetplay.view.viewPlayer;
import com.ligabetplay.view.viewTeam;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------MENU----------------");
            System.out.println("1. View Teams");
            System.out.println("2. View Players");
            System.out.println("3. View Doctors");
            System.out.println("4. View Coaches");
            System.out.println("5. Exit");
            int option = scanner.nextInt();
            Controller ctrl = new Controller();
            
            switch (option) {
                case 1 -> {
                    viewTeam.controlador = ctrl;
                    viewTeam vt = new viewTeam();
                    vt.start();
                }
                case 2 -> {
                    viewPlayer.controlador = ctrl;
                    viewPlayer vp = new viewPlayer();
                    vp.start();
                }
                case 3 -> {
                    viewDoctor.controlador = ctrl;
                    viewDoctor vd = new viewDoctor();
                    vd.start();
                }
                case 4 -> {
                    viewCoach.controlador = ctrl;
                    viewCoach vc = new viewCoach();
                    vc.start();
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}