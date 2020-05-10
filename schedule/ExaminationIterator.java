package schedule;

import events.Event;
import events.Examination;

import java.util.ArrayList;
import java.util.Iterator;

public class ExaminationIterator implements Iterator {
    private ArrayList<Event> events;
    private int index;
    public ExaminationIterator(ArrayList<Event> events) {
        this.events = events;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < events.size() && events.get(index) != null;
    }
    @Override
    public Object next() {
        while (this.hasNext()) {
            if ((events.get(index) instanceof Examination) && (!((Examination) events.get(index)).getDone())) {
                return events.get(index++);
            }
            index++;

        }
        return null;
    }


}
