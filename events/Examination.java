package events;

import users.Doctor;
import users.Pacient;
import users.Personel;
import users.TransferObserver;

public class Examination extends Event {
    private int duration;

    public Examination(Pacient pacient, Personel personel, int duration) {
        super(pacient, personel);
        this.duration = duration;
        // TODO Auto-generated constructor stub
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public boolean getDone() {
        return this.done;
    }

    @Override
    public void notifyAllObservers() {

    }

    @Override
    public void registerObserver(TransferObserver observer) {

    }

    @Override
    public void unregisterObserver(TransferObserver observer) {

    }
}