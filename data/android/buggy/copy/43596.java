public void cancel() {
    try {
        serverSocket.close();
    } catch (java.io.IOException e) {
        android.util.Log.e("listenThread", e.getMessage());
    }
}