package schedule;

import java.util.ArrayList;
import java.util.Iterator;

import events.Event;

public abstract class Schedule {

    public abstract ArrayList<Event> getEvents();

    public abstract Iterator createIterator();

}