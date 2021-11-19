@java.lang.Override
public void handleEvent(ru.otus.observer.Event event) {
    java.lang.System.out.println((("id = " + (id)) + ": SAVE_EVENT"));
    saveState();
}