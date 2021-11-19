public void StartTimer() {
    (ticks)++;
    java.lang.System.out.println(ticks);
    if ((ticks) < 100) {
        Draw("Der Test", "FFFFFF", 30, desiredHeight);
    }else {
        done = false;
        ticks = 0;
    }
}