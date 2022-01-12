@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    bg = new com.droidkings.game.Background(android.graphics.BitmapFactory.decodeResource(getResources(), R.drawable.gamebg1));
    thread.setRunning(true);
    thread.start();
}