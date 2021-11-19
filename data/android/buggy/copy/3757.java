public void updateNumConnectedOutput(android.view.View view) {
    java.lang.String a = "" + (hub.getNumConnected());
    if ((hub) != null)
        numConnectedOutput.setText(a);
    
}