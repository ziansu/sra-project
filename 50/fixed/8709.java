private java.lang.String getCurrentlyPlaying() throws java.io.IOException, java.lang.ClassNotFoundException {
    outToServer.writeObject("curr");
    return ((java.lang.String) (inFromServer.readObject()));
}