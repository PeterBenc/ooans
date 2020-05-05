package pacientPlanStrategies;

import controller.UserController;
import schedule.*;
import scheduleBuilders.ConcreteScheduleBuilder;
import scheduleBuilders.Director;
import users.Doctor;
import users.Pacient;

public class ExaminationPlanner implements SchedulePlanner {

    private ConcreteScheduleBuilder concreteScheduelBuilder;

    public ExaminationPlanner(UserController userController) {
        this.concreteScheduelBuilder = new ConcreteScheduleBuilder(userController);
    }

    public Schedule createEvents(Pacient pacient, Doctor doctor) {
        Director director = new Director();
        director.constructExaminationPlan(concreteScheduelBuilder);
        System.out.println("Created examination plan for pacient");
        return this.concreteScheduelBuilder.getSchedule(pacient, doctor);
    }

}