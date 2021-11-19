protected void fireInvalidate(javafx.beans.Observable observable) {
    listeners.forEach(( l) -> l.invalidated(observable));
    org.marid.jfx.beans.FxCleaner.clean(listeners);
}