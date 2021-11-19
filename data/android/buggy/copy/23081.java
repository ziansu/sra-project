private void handleMessages() {
    synchronized(eventMessages) {
        java.lang.System.out.println(("Size before poll: " + (eventMessages.size())));
        while (!(eventMessages.isEmpty())) {
            recieveMessage(eventMessages.poll());
        } 
    }
}