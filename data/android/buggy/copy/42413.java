@java.lang.Override
public void run() {
    int messageCount = mMessages.size();
    mMessages.clear();
    fireTableRowsDeleted(0, (messageCount - 1));
}