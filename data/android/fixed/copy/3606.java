@java.lang.Override
public java.lang.Void run() {
    datagramSocket.close();
    datagramSocket = null;
    return null;
}