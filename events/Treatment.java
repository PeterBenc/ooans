package events;

import users.Doctor;
import users.Pacient;
import users.Personel;

public class Treatment extends Event {

    public Treatment(Pacient pacient, Personel personel) {
        super(pacient, personel);
        // TODO Auto-generated constructor stub
    }
    
}