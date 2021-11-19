@java.lang.Override
public boolean remove(ua.kobzev.theatre.domain.Event event) {
    int result = jdbcOperations.update("DELETE FROM events WHERE name =?", event.getName());
    return result == 0 ? false : true;
}