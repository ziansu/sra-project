public void sendNext() {
    if ((messages.size()) > 0)
        messages.remove(0);
    
    send();
}