@java.lang.Override
public void onCancel(android.content.DialogInterface dialogInterface) {
    super.onCancel(dialogInterface);
    m_mediaPlayer.stop();
    m_thread.cancel(true);
    m_mediaPlayer.release();
    m_mediaPlayer = null;
}