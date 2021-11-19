private void shift(Bluetooth.BluetoothInterface.Packet packet) {
    this.flush();
    Audio.SongPlayer.timePositionOffset += ((int) (packet.launchTime));
}