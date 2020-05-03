package controller;

import java.util.ArrayList;

import pacientPlanStrategies.*;
import users.*;

public class UserController {

    private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
    private Doctor doctor = new Doctor("Dr. Drake Remore");
    private Nurse nurse = new Nurse("Paula");
    private SchedulePlanner hospitalizationPlaner = new HospitalizationPlanner(this);
    private SchedulePlanner examinationPlanner = new ExaminationPlanner(this);
    private SchedulePlanner noscheduPlanner = new NoSchedulePlanner();
    
    public void addPacient(String name, int createExaminationPlan) {
        Pacient newPacient = new Pacient(
            name,
            createExaminationPlan == 1 ? this.examinationPlanner : this.noscheduPlanner
        );
        this.pacients.add(newPacient);
        newPacient.createSchedule();
    }

    public void examinePacient(String name) {
        Pacient ePacient;
        for (Pacient pacient:pacients) {
            if (pacient.getName().equals(name)) {
                ePacient = pacient;
                break;
            }
        }
        // tu zavolas metodu z view aby vypisala eventy resp null object..
        // metoda co zobrazi detaily vysetrenia, ak neni chceme dat nullObject a skoncit
        // tu uz ide volanie examinationControllera
        
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public Nurse getNurse() {
        return this.nurse;
    }

}