@java.lang.Override
public boolean onUnbind(android.content.Intent intent) {
    IsActivityAlive = false;
    closeSeekThread();
    return super.onUnbind(intent);
}