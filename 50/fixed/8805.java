public static robokill.GamePanel getGamePanel() {
    if ((robokill.GamePanel.This) == null) {
        robokill.GamePanel.This = new robokill.GamePanel();
    }
    return robokill.GamePanel.This;
}