@java.lang.Override
public void run() {
    java.lang.System.out.println("STARTING SEEK PROCEDURE");
    bl.startSeeking();
    try {
        java.lang.Thread.currentThread().join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}