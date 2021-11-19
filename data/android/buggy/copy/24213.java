public com.qwasi.sdk.QwasiLocationState stateCheck() {
    if ((state) == (com.qwasi.sdk.QwasiLocationState.QwasiLocationStateInside)) {
        return state;
    }else
        if ((type) == (com.qwasi.sdk.QwasiLocationType.QwasiLocationTypeBeacon)) {
            return com.qwasi.sdk.QwasiLocationState.QwasiLocationStateOutside;
        }else {
            return com.qwasi.sdk.QwasiLocationState.QwasiLocationStateUnknown;
        }
    
}