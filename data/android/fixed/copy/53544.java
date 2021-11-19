public static final boolean isInreachAvailable() {
    if (org.magdaaproject.sam.InReachMessageHandler.m_queuesynced) {
        if ((org.magdaaproject.sam.InReachMessageHandler.m_queued_count) == 0) {
            return true;
        }
    }
    return false;
}