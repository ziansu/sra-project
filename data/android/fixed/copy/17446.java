public void disconnect() {
    try {
        socket.close();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    } catch (java.lang.NullPointerException e2) {
        java.lang.System.out.println("No socket open!");
    }
    java.lang.System.out.println("Socket closed");
}