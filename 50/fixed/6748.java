private static void pause() {
    if ((com.gcex.GameCircle.agsClient) != null) {
        com.gcex.GameCircle.agsClient.release();
        com.gcex.GameCircle.agsClient = null;
    }
}