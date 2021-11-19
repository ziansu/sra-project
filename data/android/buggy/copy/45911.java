@java.lang.Override
public void update(final java.util.Observable o, final java.lang.Object arg) {
    java.lang.System.out.println("stop");
    cLabelSubject.update((("Move your phone " + (cDirections[cOperationNr])) + "!"));
    cDelayNewInput = false;
}