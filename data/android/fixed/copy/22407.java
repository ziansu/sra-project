@java.lang.Override
public void run() {
    try {
        MessageData.DataHandling.loadMessagePoolFromDisk();
        checkForOldMessages();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}