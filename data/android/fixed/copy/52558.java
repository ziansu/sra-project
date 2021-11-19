@java.lang.Override
public void pause() {
    playing = false;
    try {
        gameThread.join();
    } catch (java.lang.InterruptedException e) {
        android.util.Log.e("bbb", ("InterruptedException:" + e));
    }
}