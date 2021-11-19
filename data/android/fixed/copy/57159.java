public void send(java.lang.String message) {
    synchronized(messages) {
        messages.add(0, message);
        java.lang.System.out.println(("Message added #messages=" + (messages.size())));
        messages.notify();
    }
}