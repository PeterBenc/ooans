package schedule;

import java.util.ArrayList;

import events.Event;

public class EventSchedule extends Schedule {

    private ArrayList<Event> events;

    public EventSchedule(ArrayList<Event> events) {
        this.events = events;
    }
    
}