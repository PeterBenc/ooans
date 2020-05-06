package events;

import java.sql.Date;

import users.Doctor;
import users.Pacient;
import users.Personel;
import users.TransferObserver;

public abstract class Event {

    protected Date date;
    protected Pacient pacient;
    protected Personel personel;
    protected boolean done = false;

    public Event(Pacient pacient, Personel personel) {
        this.pacient = pacient;
        this.personel = personel;
    }

    public abstract void setDone(Boolean done);

    public abstract boolean getDone();

    public abstract void notifyAllObservers();


    public abstract void registerObserver(TransferObserver observer);


    public abstract void unregisterObserver(TransferObserver observer);
}