package events;

import java.sql.Date;

import users.Doctor;
import users.Pacient;
import users.Personel;

public class Event {

    protected Date date;
    protected Pacient pacient;
    protected Personel personel;

    public Event(Pacient pacient, Personel personel) {
        this.pacient = pacient;
        this.personel = personel;
    }

}