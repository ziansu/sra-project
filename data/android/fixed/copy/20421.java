@java.lang.Override
public boolean stop() {
    java.lang.System.out.println("Platform stopped");
    try {
        client.close();
        clientThread.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
        return false;
    }
    return true;
}