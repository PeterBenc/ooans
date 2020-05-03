package events;

import users.Doctor;
import users.Pacient;
import users.Personel;

public class Transfer extends Event {

    public Transfer(Pacient pacient, Personel personel) {
        super(pacient, personel);
        // TODO Auto-generated constructor stub
    }
    
}