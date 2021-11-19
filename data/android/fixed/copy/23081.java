private void handleMessages() {
    synchronized(eventMessages) {
        while (!(eventMessages.isEmpty())) {
            recieveMessage(eventMessages.poll());
        } 
    }
}