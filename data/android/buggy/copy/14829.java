@java.lang.Override
public void insertUpdate(javax.swing.event.DocumentEvent arg0) {
    calculateDeltaTime(((java.util.Date) (startField.getValue())), ((java.util.Date) (stopField.getValue())), java.util.concurrent.TimeUnit.MINUTES);
    checkOkEnabled();
}