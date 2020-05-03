package pacientPlanStrategies;

import schedule.*;

public class NoSchedulePlanner implements SchedulePlanner {

    private NoSchedule noSchedule = new NoSchedule();

    public Schedule createEvents() {
        System.out.println("Rozvrh nebol vytvoreny.");
        return noSchedule;
    }
    
}