public void spinWheel(android.view.View v) {
    v.setEnabled(false);
    java.util.Random random = new java.util.Random();
    dialer.setEnabled(false);
    dialer.post(new com.concon.talkabout.talkabout.SpinWheelGameplay.FlingRunnable(random.nextInt(1500), v));
}