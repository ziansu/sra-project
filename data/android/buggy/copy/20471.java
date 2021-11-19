public boolean isConnecting() {
    java.io.PrintStream out;
    try {
        out = new java.io.PrintStream(client.getOutputStream());
    } catch (java.io.IOException e) {
        return false;
    }
    return out.checkError();
}