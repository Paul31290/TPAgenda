package agenda;

import java.time.*;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {

    private List<Event> agenda = new ArrayList<Event>();
    Event e;

    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        agenda.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        // TODO : implémenter cette méthode
        List<Event> eventsInDay = new ArrayList<Event>();
        for (Event agenda : agenda){
            if (e.isInDay(day) == true) {
                eventsInDay.add(e);
            }
           }
        return eventsInDay;
    }
}
