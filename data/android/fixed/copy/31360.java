private void execute(org.decaywood.entity.KeyEvent event) throws java.lang.InterruptedException {
    java.lang.System.out.println(event);
    sequencer.processKeyEvent(event, this::sendEvent);
}