@java.lang.Override
public synchronized net.viktorc.detroid.framework.uci.SearchResults get() {
    while (!(isDone)) {
        try {
            wait();
        } catch (java.lang.InterruptedException e) {
        }
    } 
    return results;
}