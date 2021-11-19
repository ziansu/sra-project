public void onClickTrim(android.view.View view) {
    isRunning = false;
    sendCommand(de.hhn.munz.ardrone2.ATCommand.trim(), false);
}