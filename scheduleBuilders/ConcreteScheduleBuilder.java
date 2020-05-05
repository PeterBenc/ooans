package scheduleBuilders;

import java.util.ArrayList;

import controller.UserController;
import events.*;
import schedule.EventSchedule;
import schedule.Schedule;
import users.Doctor;
import users.Pacient;

public class ConcreteScheduleBuilder implements ScheduleBuilder {

    private UserController userController;

    private int nOfTreatments = 0;

    public ConcreteScheduleBuilder(UserController userController) {
        this.userController = userController;
    }

    public void setnOfTreatments(int nOfTreatments) {
        this.nOfTreatments = nOfTreatments;
    }


    @Override
    public ArrayList<Examination> buildExaminations(Pacient pacient) {
        ArrayList<Examination> examinations = new ArrayList<Examination>();
        examinations.add(new Examination(pacient, userController.getDoctor(), 30));
        examinations.add(new Examination(pacient, userController.getDoctor(), 40));
        return examinations;
    }

    @Override
    public ArrayList<Transfer> buildTranfers(Pacient pacient, Doctor doctor) {
        ArrayList<Transfer> transfers = new ArrayList<Transfer>();
        Transfer transfer = new Transfer(pacient, userController.getNurse());
        transfer.registerObserver(doctor);
        transfers.add(transfer);
        return transfers;
    }

    @Override
    public ArrayList<Treatment> buildTreatments(Pacient pacient) {
        ArrayList<Treatment> treatments = new ArrayList<Treatment>();
        for(int i=0; i< nOfTreatments; i++) {
            treatments.add(new Treatment(pacient, userController.getNurse()));
        }
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