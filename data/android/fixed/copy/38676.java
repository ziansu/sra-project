@java.lang.Override
public void run() {
    while (!(con.isClosed())) {
        update();
    } 
}