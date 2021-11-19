void showRunningMessage(boolean running) {
    if (running)
        testsHeaderRunningMessage.setText("Running...");
    else
        testsHeaderRunningMessage.setText("");
    
}