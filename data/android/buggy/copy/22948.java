private void startGame() {
    gameInfoPanel.setVisible(false);
    frame.GameFrame gFrame = new frame.GameFrame();
    proxyClient.MainTimer timer = new proxyClient.MainTimer();
    gFrame.frame();
    timer.createTimer();
    gFrame.start();
}