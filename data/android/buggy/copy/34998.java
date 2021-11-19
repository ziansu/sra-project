private void pause(byte[] songData) {
    songPlaying = false;
    player.addTask(new Bluetooth.BluetoothInterface.Packet(PAUSE, songData));
    station.broadcast(songData, Controllers.PAUSE);
}