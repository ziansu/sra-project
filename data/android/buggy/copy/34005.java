public final void postread() {
    java.lang.Thread t = java.lang.Thread.currentThread();
    readlock.unlock();
}