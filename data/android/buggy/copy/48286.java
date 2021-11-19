@java.lang.Override
public void onClick(android.view.View v) {
    speed += ((speed) == 0) ? 0 : -1;
    java.lang.String cmd = "" + (speed);
    this.sendCommand(cmd);
}