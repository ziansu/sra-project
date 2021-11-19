@java.lang.Override
public synchronized boolean ticketsFound() {
    return !(alreadyChecked.contains(currentLink));
}