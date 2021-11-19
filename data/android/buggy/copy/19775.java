@java.lang.Override
public void run() {
    while (true) {
        Simulator._roboter.update();
        Delay.msDelay(1000);
    } 
}