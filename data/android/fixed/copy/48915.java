@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    editedOrDeletedCall.call(null);
    listener.onApplyFilterEntry(entriesNames[which]);
}