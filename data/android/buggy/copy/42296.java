@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    login_deal_flag = new com.jiaying.workstation.utils.DealFlag();
    com.jiaying.workstation.thread.ObservableZXDCSignalListenerThread observableZXDCSignalListenerThread = new com.jiaying.workstation.thread.ObservableZXDCSignalListenerThread();
    observableZXDCSignalListenerThread.start();
}