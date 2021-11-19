private void pause() {
    player.addTask(new Bluetooth.BluetoothInterface.Packet(PAUSE, null));
    station.broadcast(new byte[1], Controllers.PAUSE);
}