public boolean isRecordable() {
    if ((mDoNotRecord) == null) {
        determineRecordable();
    }
    return (mRecordable) & (!(mDoNotRecord));
}