public final void sendMessage(final int id, final int arg1) {
    mHandler.sendMessage(mHandler.obtainMessage(id, arg1));
}