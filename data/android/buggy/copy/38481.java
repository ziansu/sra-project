public void addToLog(java.lang.String channel, java.lang.String message) {
    synchronized(log) {
        java.util.ArrayList<java.lang.String> array = new java.util.ArrayList<>();
        array.add(message);
        addToLog(channel, array);
    }
}