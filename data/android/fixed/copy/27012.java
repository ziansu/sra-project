void disconnect() {
    new rskupnik.edgar.networking.Connection.SendPacketTask().execute(new java.lang.Object[]{ 1 });
    exit = true;
}