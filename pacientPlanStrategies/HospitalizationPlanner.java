package pacientPlanStrategies;

import controller.UserController;
import machines.EKGMachine;
import schedule.Schedule;
import scheduleBuilders.ConcreteScheduleBuilder;
import scheduleBuilders.Director;
// import scheduleBuilders.HospitalizationScheduleBuilder;
import users.Doctor;
import users.Pacient;

public class HospitalizationPlanner implements SchedulePlanner {

    private ConcreteScheduleBuilder concreteScheduleBuilder;

    public HospitalizationPlanner(UserController userController) {
        this.concreteScheduleBuilder = new ConcreteScheduleBuilder(userController);
    }

    public Schedule createEvents(Pacient pacient, Doctor doctor) {
        Director director = new Director();
        director.constructExaminationPlan(concreteScheduleBuilder);
        System.out.println("Created hospitalization plan for pacient");
        return this.concreteScheduleBuilder.getSchedule(pacient, doctor);
    }

}