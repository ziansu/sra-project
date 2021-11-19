@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    plugin.deleteRecording(recording, true);
    listAdapter.remove(recording);
}