package schedule;

import java.util.ArrayList;
import java.util.Iterator;

import events.Event;

public class EventSchedule extends Schedule {
    private ArrayList<Event> events;
    public EventSchedule(ArrayList<Event> events) {
        this.events = events;
    }
    @Override
    public ArrayList<Event> getEvents() {
        System.out.println(this.events);
        return this.events;
    }
    @Override
    public Iterator createIterator() {
        return new ExaminationIterator(events);
    }

}


