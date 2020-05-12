package schedule;

import java.util.ArrayList;
import java.util.Iterator;

import events.Event;

public class NoSchedule extends Schedule {

    private static NoSchedule noSchedule = null;

    @Override
    public ArrayList<Event> getEvents() {
        System.out.println("Rozvrh neexistuje.");
        return null;
    }

    private NoSchedule() {
    }

    public static NoSchedule getInstance() {
        if (noSchedule == null) {
            return new NoSchedule();
        }
        return noSchedule;
    }

    @Override
    public Iterator createIterator() {
        return null;
    }

}