package users;

import machines.*;
import pacientPlanStrategies.SchedulePlanner;
import schedule.Schedule;

public class Pacient extends User{

    private SchedulePlanner schedulePlanner;
    private Schedule schedule;
    private EKGMachine ekgMachine;
    private Machine maschine;

    public Pacient(String name, SchedulePlanner schedulePlanner) {
        super(name);
        this.schedulePlanner = schedulePlanner;
    }

    public void setSchedulePlanner(SchedulePlanner schedulePlanner) {
        this.schedulePlanner = schedulePlanner;
    }

    public void createSchedule() {
        this.schedule = this.schedulePlanner.createEvents(this);
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public void setEkgMachine(EKGMachine ekgMachine) {
        this.ekgMachine = ekgMachine;
    }

    public void setMachine(Machine machine) {
        this.maschine = machine;
    }
    
}