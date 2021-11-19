public void send(java.io.Serializable serializable) throws java.io.IOException {
    synchronized(serializable) {
        oos.writeObject(serializable);
        oos.flush();
    }
}