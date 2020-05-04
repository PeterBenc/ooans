package events;

import users.Doctor;
import users.Pacient;
import users.Personel;

public class Transfer extends Event {

    private boolean done = false;

    public Transfer(Pacient pacient, Personel personel) {
        super(pacient, personel);
        // TODO Auto-generated constructor stub
    }

    public void setDone(Boolean done) {
        this.done = done;
        // eventObserver.update();
    }

}