public void start() {
    updateThread = new com.hewid.alpheus.Controller.Pacemaker.UpdateThread();
    drawThread = new com.hewid.alpheus.Controller.Pacemaker.DrawThread();
    isRunning = true;
    drawThread.start();
    updateThread.start();
}