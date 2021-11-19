@java.lang.Override
public void run() {
    setupStreams();
    tellClientId();
    tellClientRole();
    if (connectedToSender) {
        recieveData();
    }else {
        sendData();
    }
}