private void sendStatus(Server.ClientThread thread, int command, java.lang.String status) {
    Tuple tuple = new Tuple(command);
    tuple.put(status);
    thread.sendData(tuple);
}