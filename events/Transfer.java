package events;

import java.util.ArrayList;

import users.Doctor;
import users.Pacient;
import users.Personel;
import users.TransferObserver;

public class Transfer extends Event {

    private ArrayList<TransferObserver> doctorObservers = new ArrayList<TransferObserver>();

    public Transfer(Pacient pacient, Personel personel) {
        super(pacient, personel);
    }

    public void notifyAllObservers() {
        for (TransferObserver observer : this.doctorObservers) {
            observer.update();
            System.out.println("Doktor bol notifikovany");
        }
    }

    public void registerObserver(TransferObserver observer) {
        this.doctorObservers.add(observer);
    }

    @Override
    public void unregisterObserver(TransferObserver observer) {
        this.doctorObservers.remove(doctorObservers.indexOf(observer));
    }

    public void setDone(Boolean done) {
        this.done = done;
        notifyAllObservers();
    }

    @Override
    public boolean getDone() {
        return this.done;
    }

}