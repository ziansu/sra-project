private void addSong(int index) throws java.io.IOException {
    outToServer.writeObject("add");
    outToServer.writeObject(index);
}