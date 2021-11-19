public void processEvent(edu.cmu.scs.fluorite.commands.ICommand event) {
    java.lang.System.out.println("sending event");
    edu.cmu.scs.fluorite.model.EventRecorder.getInstance().recordCommand(event);
}