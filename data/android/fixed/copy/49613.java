@java.lang.Override
protected void onAction() {
    try {
        updateMap();
    } catch (java.io.IOException ex) {
        console.error(ex);
    }
    console.info("Azione effettuata.");
}