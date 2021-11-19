public void sendMessage(byte message) {
    try {
        if ((out) != null) {
            out.write(message);
            out.flush();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}