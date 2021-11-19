void emitterOnCompleted() {
    mIsConnected = true;
    if ((mEmitter) != null) {
        mEmitter.onCompleted();
    }
}