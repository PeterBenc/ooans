package events;

import java.util.ArrayList;

import users.Doctor;
import users.Pacient;
import users.Personel;

public class Transfer extends Event {

    private ArrayList<Doctor> doctorObservers = new ArrayList<Doctor>();

    private boolean done = false;

    public Transfer(Pacient pacient, Personel personel) {
        super(pacient, personel);
        // TODO Auto-generated constructor stub
    }
    public void setDone(Boolean done) {
        this.done = done;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for(Doctor doctor:this.doctorObservers) {
            doctor.update();
            System.out.println("Doktor bol notifikovany");
        }
    }

    public void registerObserver(Doctor doctor) {
        this.doctorObservers.add(doctor);
    }

}