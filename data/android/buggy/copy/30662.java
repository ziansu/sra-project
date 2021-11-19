@java.lang.Override
public void run() {
    try {
        setup();
        run();
        end();
    } catch (java.net.SocketException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}