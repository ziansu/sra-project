private int notify_update(int update_flag, int arg1, int arg2) {
    if ((mNativeEventListener) != null) {
        return mNativeEventListener.notify_update(update_flag, arg1, arg2);
    }
    return -1;
}