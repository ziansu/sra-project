@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    entryFragmentListener.onSightingEntryPositiveClick(this);
    editFragmentListener.onSightingEditNegativeClick(this);
}