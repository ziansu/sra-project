@java.lang.Override
public void run() {
    if ((BabystepsTimer.getTime()) != null)
        BabystepsTimer.stop();
    
    BabystepsTimer.startTimer();
}