package controller;

import java.util.ArrayList;
import java.util.List;

import events.*;
// import jdk.internal.event.Event;
// import jdk.internal.net.http.websocket.Transport;
import pacientPlanStrategies.*;
import users.*;

public class UserController {

    private SchedulePlanner hospitalizationPlaner = new HospitalizationPlanner(this);
    private SchedulePlanner examinationPlanner = new ExaminationPlanner(this);
    private SchedulePlanner noschedulePlanner = new NoSchedulePlanner();
    private static UserController userController = null;
    private ExaminationController examinationController;
    private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
    private Doctor doctor = new Doctor("Dr. Drake Remore");
    private Nurse nurse = new Nurse("Paula");
    private SchedulePlanner hospitalizationPlaner = new HospitalizationPlanner(this);
    private SchedulePlanner examinationPlanner = new ExaminationPlanner(this);
    private SchedulePlanner noschedulePlanner = new NoSchedulePlanner();

    public void setPacientExaminationsPlan(String name) {
        Pacient pacient = getPacient(name);
        pacient.setSchedulePlanner(this.examinationPlanner);
        pacient.createSchedule(this.doctor);
    }

    public void transportPacient(String name) {
        Pacient pacient = getPacient(name);
        ArrayList<Event> transports = pacient.getSchedule().getEvents();
        for (Event event : transports) {
            if (event instanceof Transfer)
                event.setDone(true);
        }
        System.out.println("Pacient bol presunuty");
    }
    
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


        newPacient.createSchedule(this.doctor);
    }

    public Pacient getPacient(String name) {
        for (Pacient pacient : pacients) {
            if (pacient.getName().equals(name)) {
                return pacient;
            }
        }
        return null;
    }

    public void setPacientHospitalizationPlan(String name) {
        Pacient pacient = getPacient(name);
        pacient.setSchedulePlanner(this.hospitalizationPlaner);
        pacient.createSchedule(this.doctor);
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public Nurse getNurse() {
        return this.nurse;
    }

}