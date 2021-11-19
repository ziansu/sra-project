public void setListener(client.ClientListenerThread l) {
    listener = l;
    listener.start();
}