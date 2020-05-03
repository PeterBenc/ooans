package pacientPlanStrategies;

import schedule.*;

public class ExaminationPlanner implements SchedulePlanner {

    public Schedule createEvents() {
        System.out.println("Created examination plan for pacient");
        return new Schedule();
    }
    
}