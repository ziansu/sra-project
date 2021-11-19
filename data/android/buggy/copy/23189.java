private void closeSocket() throws java.io.IOException {
    out.close();
    socket.close();
    android.util.Log.d("closeSocket", "closeSocket");
}