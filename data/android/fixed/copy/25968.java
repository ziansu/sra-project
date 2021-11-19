private void remove(Server.ClientThread clientThread) {
    synchronized(threadList) {
        threadList.remove(clientThread);
    }
}