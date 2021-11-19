@java.lang.Override
public void run() {
    com.impavidly.util.backup.Backup backup = this;
    synchronized(backup) {
        backup.setChanged();
        backup.notifyObservers(getRecord());
    }
}