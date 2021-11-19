@java.lang.Override
protected void onPostExecute(java.lang.Double result) {
    thisTaskListener.onChunkResultReady(chunkNumber, result);
}