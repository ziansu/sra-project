final void sendMessage(com.trch.IProcessMessage processMessage) {
    synchronized(processMessage) {
        processMessages.add(processMessage);
    }
}