@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.cancel();
    java.lang.System.arraycopy(tmpCheckedItems, 0, Appl.selectedCategories, 0, Appl.selectedCategories.length);
    mListener.onFilterDialogNegativeClick(this);
}