@java.lang.Override
public void run() {
    timerlabel.setText(((("TIMER: " + (babyclock.currenttime)) + "/") + (babyclock.maxtime)));
    if ((babyclock.currenttime) >= (babyclock.maxtime)) {
        backandcheck();
    }
}