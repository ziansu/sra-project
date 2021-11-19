public void stopRecording() {
    if (mIsRecorkding) {
        synchronized(mAudioRecordLock) {
            mAudioRecord.stop();
            mAudioRecord.release();
            mAudioRecord = null;
        }
        mIsRecorkding = false;
    }
}