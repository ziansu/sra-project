public void putMessage(org.openda.interfaces.IInstance source, java.lang.String message) {
    progressDisplayer.append((message + "\n"));
    setCursorToEnd(this.progressDisplayer);
}