public void start() {
    drawThread = new com.hewid.alpheus.Controller.Pacemaker.DrawThread();
    updateThread = new com.hewid.alpheus.Controller.Pacemaker.UpdateThread();
    isRunning = true;
    drawThread.start();
    updateThread.start();
}