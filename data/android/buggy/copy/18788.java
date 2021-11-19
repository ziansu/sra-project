@java.lang.Override
protected void pressQuestionMark() {
    robot.keyPress(java.awt.event.KeyEvent.VK_SHIFT);
    robot.keyPress(java.awt.event.KeyEvent.VK_SLASH);
    robot.delay(this.generateRandomPressTime());
    robot.keyRelease(java.awt.event.KeyEvent.VK_SLASH);
    robot.keyRelease(java.awt.event.KeyEvent.VK_EXCLAMATION_MARK);
}