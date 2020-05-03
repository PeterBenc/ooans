package pacientPlanStrategies;

import schedule.*;
import users.Pacient;

public class NoSchedulePlanner implements SchedulePlanner {

    private NoSchedule noSchedule = new NoSchedule();

    public Schedule createEvents(Pacient pacient) {
        System.out.println("Rozvrh nebol vytvoreny.");
        return noSchedule;
    }
    
}