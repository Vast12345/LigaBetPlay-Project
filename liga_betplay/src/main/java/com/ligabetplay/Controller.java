package com.ligabetplay;


import java.util.Hashtable;

import com.ligabetplay.models.Coach;
import com.ligabetplay.models.Doctor;
import com.ligabetplay.models.Player;
import com.ligabetplay.models.Team;

public class Controller {
    public Hashtable <String,Team> equipos = new Hashtable<>();
    public Hashtable <String,Player> players = new Hashtable<>();
    public Hashtable <String,Doctor> doctors = new Hashtable<>();
    public Hashtable <String,Coach> coachs = new Hashtable<>();
}
