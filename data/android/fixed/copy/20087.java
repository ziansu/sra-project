@java.lang.Override
public void processServer(java.lang.String data, java.net.Socket client, java.lang.String time, com.lms.network.TCPServerInterface tcp) {
    tcp.broadcast(client, java.lang.String.format("%c%s", com.lms.network.NetworkEventBuff.headerCode, data));
}