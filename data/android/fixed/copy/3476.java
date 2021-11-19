@java.lang.Override
public synchronized void join() throws java.lang.Exception {
    while (!(_status.equals(Status.STOPPED))) {
        this.wait();
    } 
}