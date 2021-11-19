@java.lang.Override
public void messageSent() {
    conversationReady = true;
    if (conversationReady) {
        uiAdapter.doneWaiting();
    }else {
        uiAdapter.waitForProcessing();
    }
}