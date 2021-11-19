@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    plugin.deleteRecording(recording);
    listAdapter.remove(recording);
}