@java.lang.Override
protected void handleRecievedMessage(hu.barbar.comm.util.Msg message) {
    showText(("Received: " + (message.toString())));
}