android.service.voice.VoiceInteractionSession.Request removeRequest(android.os.IBinder reqInterface) {
    synchronized(this) {
        return mActiveRequests.remove(reqInterface);
    }
}