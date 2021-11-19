@java.lang.Override
void cancelAllMove() {
    count = 0;
    isLoop = false;
    action.getAction().cancelMove();
    synchronized(this) {
        this.notifyAll();
    }
}