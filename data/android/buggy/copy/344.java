public void saveEvent(com.urcssa.Event.CssaEvent event) throws java.lang.Exception {
    java.io.FileOutputStream saveEvent = new java.io.FileOutputStream("SaveEvent.sav");
    java.io.ObjectOutputStream save = new java.io.ObjectOutputStream(saveEvent);
    save.close();
}