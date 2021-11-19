@java.lang.Override
public void run() {
    while (true) {
        try {
            org.ja.ManagementServer.server();
        } catch (java.io.IOException ex) {
        }
    } 
}