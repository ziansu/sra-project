public synchronized void receiveCommand(java.lang.String cmdIn) {
    if (cmdIn == null) {
        _userInput = null;
        errorOut(CMD_NULL);
    }else {
        _userInput = cmdIn.trim();
    }
}