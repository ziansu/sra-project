@java.lang.Override
public void sendCommand(java.lang.String command) {
    try {
        try {
            socket.write(command);
        } catch (java.lang.NullPointerException n) {
            n.printStackTrace();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}