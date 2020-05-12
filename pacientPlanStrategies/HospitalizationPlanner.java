package pacientPlanStrategies;

import controller.UserController;
import machines.EKGMachine;
import schedule.Schedule;
import scheduleBuilders.ConcreteScheduleBuilder;
import scheduleBuilders.Director;
import users.Doctor;
import users.Pacient;

public class HospitalizationPlanner implements SchedulePlanner {

    private ConcreteScheduleBuilder concreteScheduleBuilder;
    private Director director = new HospitalizationDirector();

    public HospitalizationPlanner(UserController userController) {
        this.concreteScheduleBuilder = new ConcreteScheduleBuilder(userController);
    }

    public Schedule createEvents(Pacient pacient, Doctor doctor) {
        director.constructPlan(concreteScheduleBuilder);
        System.out.println("Created hospitalization plan for pacient");
        return this.concreteScheduleBuilder.getSchedule(pacient, doctor);
    }

}

