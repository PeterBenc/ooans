package users;

import pacientPlanStrategies.EventPlanner;

public class Pacient {

    protected EventPlanner eventPlanner;

    public Pacient(EventPlanner eventPlanner) {
        this.eventPlanner = eventPlanner;
    }

    public void setEventPlanner(EventPlanner eventPlanner) {
        this.eventPlanner = eventPlanner;
    }

    public void createEventPlan() {
        this.eventPlanner.createEvents();
    }
    
}