@java.lang.Override
public synchronized void step(double dtime) {
    orientationprintouttimer += dtime;
    if ((targetorientation) != null) {
        move(((float) (dtime)));
    }
    printOut(((float) (dtime)));
}