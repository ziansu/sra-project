@java.lang.Override
public void run() {
    while (!(con.isClosed())) {
        try {
            update();
        } catch (java.io.IOException ex) {
            ex.printStackTrace();
        }
    } 
}