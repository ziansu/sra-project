@java.lang.Override
public void run() {
    java.lang.System.out.println("Stopping jetty");
    try {
        server.stop();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    server.destroy();
}