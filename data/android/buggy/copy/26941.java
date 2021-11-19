@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((plugin) != null) {
        plugin.deleteRecording(getRecording());
        getMapActivity().getContextMenu().close();
    }
}