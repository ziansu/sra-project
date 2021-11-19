@java.lang.Override
public void run() {
    if (poll())
        onNewMessage();
    
}