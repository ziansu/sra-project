@java.lang.Override
public int getEmailCount() {
    checkInitialized();
    synchronized(this) {
        return count;
    }
}