package com.ligabetplay;

import com.ligabetplay.view.viewTeam;

public class Main {
    public static void main(String[] args) {
        Controller ctrlteams = new Controller();
        viewTeam.controlador = ctrlTeams;
        viewTeam vt = new viewTeam();
        vt.start();


    }
}