@java.lang.Override
public void toNext() {
    android.net.Uri uri = getPlayInfoInner().nextOne(playRandomly());
    stop();
    if (uri != null) {
        play(uri, 0);
    }
}