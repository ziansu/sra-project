public final void incWriteCount() {
    (writeCount)++;
    notifyHttpSession();
}