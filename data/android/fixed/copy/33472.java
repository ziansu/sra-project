@java.lang.Override
public void shutdown() {
    java.lang.System.out.println("Shutting down colour tracking module...");
    running = false;
    cap.release();
    cap = null;
    frame.dispose();
    frame = null;
    java.lang.System.out.println("done");
}