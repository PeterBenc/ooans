package pacientPlanStrategies;

import controller.UserController;
import schedule.*;
import scheduleBuilders.ExaminationScheduleBuilder;
import users.Doctor;
import users.Pacient;

public class ExaminationPlanner implements SchedulePlanner {

    private ExaminationScheduleBuilder examinationScheduleBuilder;

    public ExaminationPlanner(UserController userController) {
        this.examinationScheduleBuilder = new ExaminationScheduleBuilder(userController);
    }

    public Schedule createEvents(Pacient pacient, Doctor doctor) {
        System.out.println("Created examination plan for pacient");
        return this.examinationScheduleBuilder.getSchedule(pacient, doctor);
    }

}