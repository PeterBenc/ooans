package pacientPlanStrategies;

import controller.UserController;
import machines.EKGMachine;
import schedule.Schedule;
import scheduleBuilders.HospitalizationScheduleBuilder;
import users.Pacient;

public class HospitalizationPlanner implements SchedulePlanner {

    private HospitalizationScheduleBuilder hospitalizationScheduleBuilder;

    public HospitalizationPlanner(UserController userController) {
        this.hospitalizationScheduleBuilder = new HospitalizationScheduleBuilder(userController);
    }

    public Schedule createEvents(Pacient pacient) {
        System.out.println("Created hospitalization plan for pacient");
        return this.hospitalizationScheduleBuilder.getSchedule(pacient);
    }

}