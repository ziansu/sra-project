public void terminateConnection() {
    out.println("CONNTERM");
    try {
        java.lang.System.out.println("Closing connection to the server");
        s.close();
    } catch (java.io.IOException ex) {
    }
}