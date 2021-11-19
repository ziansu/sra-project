android.service.voice.VoiceInteractionSession.Request removeRequest(android.os.IBinder reqInterface) {
    synchronized(this) {
        android.service.voice.VoiceInteractionSession.Request req = mActiveRequests.get(reqInterface);
        if (req != null) {
            mActiveRequests.remove(req);
        }
        return req;
    }
}