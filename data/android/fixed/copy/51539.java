@java.lang.Override
public void run() {
    while (alive.get()) {
        runNextTask();
    } 
}