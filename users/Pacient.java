package users;

import pacientPlanStrategies.SchedulePlanner;
import schedule.Schedule;

public class Pacient extends User{

    private SchedulePlanner schedulePlanner;
    private Schedule schedule;

    public Pacient(String name, SchedulePlanner schedulePlanner) {
        super(name);
        this.schedulePlanner = schedulePlanner;
    }

    public void setSchedulePlanner(SchedulePlanner schedulePlanner) {
        this.schedulePlanner = schedulePlanner;
    }

    public void createSchedule() {
        this.schedulePlanner.createEvents();
    }
    
}