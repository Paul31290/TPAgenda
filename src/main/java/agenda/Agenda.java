package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        Set<Event> agenda = new HashSet<Event>();
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
        
        for (Event agenda : agenda){
            if (e.isInDay == true) {
                
            }

        }
        throw new UnsupportedOperationException("Pas encore implémenté");
    }
}
