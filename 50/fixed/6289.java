@java.lang.Override
public void mouseDown(int buttons) {
    if ((org.sikuli.script.RobotDesktop.heldButtons) != 0) {
        org.sikuli.script.RobotDesktop.heldButtons |= buttons;
    }else {
        org.sikuli.script.RobotDesktop.heldButtons = buttons;
    }
    doMouseDown(org.sikuli.script.RobotDesktop.heldButtons);
}