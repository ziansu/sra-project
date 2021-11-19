public void startRunning() {
    try {
        connectToServer();
        getGroupList();
        whileChatting();
    } catch (java.io.EOFException eofException) {
    } catch (java.io.IOException ioException) {
        ioException.printStackTrace();
    } finally {
        closeStreams();
    }
}