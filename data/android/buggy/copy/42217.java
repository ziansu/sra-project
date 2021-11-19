@java.lang.Override
public final synchronized de.qyotta.eventstore.model.EventResponse next() {
    final de.qyotta.eventstore.model.EventResponse result = next;
    loadNextEvent();
    return result;
}