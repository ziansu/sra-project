@java.lang.Override
public void onTick(long millisUntilFinished) {
    refresh.setRotation((9 * ((i)++)));
    refresh.invalidate();
}