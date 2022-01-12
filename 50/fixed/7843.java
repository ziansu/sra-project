@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(10000);
        _p.revive();
        _player.put(P_ID, _p);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}