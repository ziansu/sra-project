@java.lang.Override
public void run() {
    try {
        if ((MessageData.DataHandling.loadMessagePoolFromDisk()) != null) {
            MessageData.DataHandling.messagePool = MessageData.DataHandling.loadMessagePoolFromDisk();
        }
        checkForOldMessages();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}