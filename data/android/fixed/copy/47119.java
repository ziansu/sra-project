@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent propertyChangeEvent) {
    if (propertyChangeEvent.getPropertyName().equals("MatchList")) {
        this.hasMatches = true;
    }
}