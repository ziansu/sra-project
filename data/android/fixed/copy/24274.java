public void putStatus(org.openda.interfaces.IInstance source, java.lang.String message) {
    synchronized(this) {
        statusDisplayer.setText(message);
    }
}