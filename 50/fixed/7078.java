@java.lang.Override
public void run() {
    mInterfaceManager.call(MainInterfaceManager.CallMode.FEED_COUNT_SET);
    setDebugDescription(Common.DEBUG_DEFAULT);
}