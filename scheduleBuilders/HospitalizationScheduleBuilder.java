package scheduleBuilders;

import java.util.ArrayList;

import controller.UserController;
import events.*;
import schedule.EventSchedule;
import schedule.Schedule;
import users.Doctor;
import users.Pacient;

public class HospitalizationScheduleBuilder implements ScheduleBuilder {

    private UserController userController;

    public HospitalizationScheduleBuilder(UserController userController) {
        this.userController = userController;
    }

    @Override
    public ArrayList<Examination> buildExaminations(Pacient pacient) {
        ArrayList<Examination> examinations = new ArrayList<Examination>();
        examinations.add(new Examination(pacient, userController.getDoctor(), 20));
        examinations.add(new Examination(pacient, userController.getDoctor(), 30));
        return examinations;
    }

    @Override
    public ArrayList<Transfer> buildTranfers(Pacient pacient, Doctor doctor) {
        ArrayList<Transfer> transfers = new ArrayList<Transfer>();
        transfers.add(new Transfer(pacient, userController.getNurse()));
        transfers.add(new Transfer(pacient, userController.getNurse()));
        return transfers;
    }

    @Override
    public ArrayList<Treatment> buildTreatments(Pacient pacient) {
        ArrayList<Treatment> treatments = new ArrayList<Treatment>();
        treatments.add(new Treatment(pacient, userController.getNurse()));
        treatments.add(new Treatment(pacient, userController.getNurse()));
        return treatments;
    }

    @Override
    public Schedule getSchedule(Pacient pacient, Doctor doctor) {
        ArrayList<Event> events = new ArrayList<Event>();
        events.addAll(buildExaminations(pacient));
        events.addAll(buildTranfers(pacient, doctor));
        events.addAll(buildTreatments(pacient));
        return new EventSchedule(events);
    }

}