@java.lang.Override
public void onClick(android.view.View v) {
    buttonplayer2Pressed = true;
    buttonplayer2.setEnabled(false);
    buttonplayer1.setEnabled(false);
    findDevices();
}