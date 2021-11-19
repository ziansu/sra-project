@java.lang.Override
public void handle(javafx.event.Event event) {
    java.lang.System.out.println(("event: " + (event.getEventType())));
    reloadFirstTab(user);
}