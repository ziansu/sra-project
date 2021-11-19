public void updateAcceleration() {
    if (riverGame.getRiver().getUserCharacter().isAccelerated()) {
        stream3 = new javax.swing.Timer(UserInterface.GamePanel.DEFAULT_DELAY_ACCELERATED, new UserInterface.GamePanel.RiverCenter.TimerListener());
        stream = stream3;
        stream.start();
    }
}