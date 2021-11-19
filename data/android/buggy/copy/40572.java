protected boolean isRecordedSessionSameAsConsumedSession() {
    if (!(mAlwaysListen))
        return true;
    
    return (mRecordedSessionId.get()) == (mConsumedSessionId.get());
}