package controller;

import java.util.ArrayList;

import pacientPlanStrategies.*;
import users.*;

public class UserController {
    private static UserController userController = null;
    private ExaminationController examinationController;
    private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
    private Doctor doctor = new Doctor("Dr. Drake Remore");
    private Nurse nurse = new Nurse("Paula");
    private SchedulePlanner hospitalizationPlaner = new HospitalizationPlanner(this);
    private SchedulePlanner examinationPlanner = new ExaminationPlanner(this);
    private SchedulePlanner noschedulePlanner = new NoSchedulePlanner();

    private UserController(ExaminationController examinationController) {
        this.examinationController = examinationController;
    }

    public static UserController getInstance(ExaminationController examinationController) {
        if (userController == null) {
            userController = new UserController(examinationController);
        }
        return userController;
    }

    public SchedulePlanner getHospitalizationPlanner() {
        return this.hospitalizationPlaner;
    }
    
    public void addPacient(String name, int createExaminationPlan) {
        Pacient newPacient = new Pacient(
            name,
            createExaminationPlan == 1 ? this.examinationPlanner : this.noschedulePlanner
        );
        this.pacients.add(newPacient);


        newPacient.createSchedule();
    }

    public void transportPacient(String name) {
        Pacient pacient = getPacient(name);
        
    }

    public Pacient getPacient(String name) {
        for (Pacient pacient:pacients) {
            if (pacient.getName().equals(name)) {
                return pacient;
            }
        }
        return null;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public Nurse getNurse() {
        return this.nurse;
    }

}