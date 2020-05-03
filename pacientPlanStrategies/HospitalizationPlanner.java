package pacientPlanStrategies;

import schedule.Schedule;

public class HospitalizationPlanner implements SchedulePlanner {

    public Schedule createEvents() {
        System.out.println("Created hospitalization plan for pacient");
        return new Schedule();
    }
    
}