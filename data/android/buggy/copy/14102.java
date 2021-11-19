public void run() {
    try {
        java.lang.System.out.println(java.lang.String.format("selectionKey isWritable:%s,isReadable:%s", selectionKey.isWritable(), selectionKey.isReadable()));
        handleKey(selectionKey);
    } catch (java.io.IOException ex) {
        selectionKey.cancel();
    }
}