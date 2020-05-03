package controller;

import java.util.ArrayList;

import pacientPlanStrategies.*;
import users.*;

public class UserController {

    private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
    private SchedulePlanner hospitalizationPlaner = new HospitalizationPlanner();
    private SchedulePlanner examinationPlanner = new ExaminationPlanner();
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
        // metoda co zobrazi detaily vysetrenia, ak neni chceme dat nullObject a skoncit
        // tu uz ide volanie examinationControllera
        
    }

}