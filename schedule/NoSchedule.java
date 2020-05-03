package schedule;

import java.util.ArrayList;

import events.Event;

public class NoSchedule extends Schedule {

    @Override
    public ArrayList<Event> getEvents() {
        System.out.println("Rozvrh neexistuje.");
        return null;
    }
    
}