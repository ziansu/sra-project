@java.lang.Override
public void removeListener(javafx.beans.InvalidationListener listener) {
    org.marid.jfx.beans.FxCleaner.clean(listeners);
    listeners.remove(listener);
}