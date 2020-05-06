package events;

import users.Doctor;
import users.Pacient;
import users.Personel;
import users.TransferObserver;

public class Treatment extends Event {

    public Treatment(Pacient pacient, Personel personel) {
        super(pacient, personel);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void setDone(Boolean done) {

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