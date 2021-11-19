@java.lang.Override
public void onClick(android.view.View v) {
    buttonplayer2Pressed = true;
    buttonplayer2.setEnabled(false);
    buttonplayer1.setEnabled(false);
    android.widget.Toast.makeText(getApplicationContext(), "Sucht nach Geräte...", Toast.LENGTH_SHORT).show();
    findDevices();
}