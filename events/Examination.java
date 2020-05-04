package events;

import users.Doctor;
import users.Pacient;
import users.Personel;

public class Examination extends Event {
    private boolean completed=false;
    private int duration;
    public Examination(Pacient pacient, Personel personel,int duration) {
        super(pacient, personel);
        this.duration=duration;
        // TODO Auto-generated constructor stub
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}