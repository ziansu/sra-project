public static void sendError(final de.zabuza.brainbridge.service.EHttpStatus status, final java.net.Socket client) throws java.io.IOException {
    de.zabuza.brainbridge.service.HttpUtil.sendHttpAnswer(EHttpContentType.TEXT, status, client);
}