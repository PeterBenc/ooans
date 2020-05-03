package controller;

import java.util.ArrayList;

import pacientPlanStrategies.*;
import users.*;

public class PacientController {

    private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
    private EventPlanner hospitalizationPlaner = new HospitalizationPlanner();
    private EventPlanner examinationPlanner = new ExaminationPlanner();
    
    public void addPacient(String pacientName) {
        Pacient newPacient = new Pacient(this.examinationPlanner);
        this.pacients.add(newPacient);
        newPacient.createEventPlan();
    }
}