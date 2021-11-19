@java.lang.Override
public void run() {
    while (active) {
        try {
            java.lang.Thread.sleep(edu.brown.cs.scij.network.MainServer.ConnectionThread.SLEEP_TIME);
        } catch (java.lang.InterruptedException ex) {
            java.lang.System.out.println("Clock jumped.");
        }
        (serverTime)++;
        if (talkative) {
        }
        checkConnections();
    } 
}