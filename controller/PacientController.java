package controller;

import java.util.ArrayList;

import pacientPlanStrategies.*;
import pacients.*;

public class PacientController {

    private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
    private SeverityPlan seriousCase = new SeriousCasePlan();
    private SeverityPlan trivialCase = new TrivialCasePlan();
    
    public void addPacient(String pacientName, int severity) {
        Pacient newPacient = new Pacient(severity == 1 ? this.seriousCase : this.trivialCase);
        this.pacients.add(newPacient);
        newPacient.createEventPlan();
    }
}