private void notifyListeners(kanzi.io.BlockEvent evt) {
    for (kanzi.io.BlockListener bl : this.listeners) {
        try {
            bl.processEvent(evt);
        } catch (java.lang.Exception e) {
        }
    }
}