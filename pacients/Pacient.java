package pacients;

import pacientPlanStrategies.SeverityPlan;

public class Pacient {

    protected SeverityPlan severityPlan;

    public Pacient(SeverityPlan severityPlan) {
        this.severityPlan = severityPlan;
    }

    public void createEventPlan() {
        this.severityPlan.createEvents();
    }
    
}