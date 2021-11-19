@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    eventItemRow.getEvent().setStatus(Event.STATUS_DELETED);
    eventItemRow.getEvent().save();
    dialog.dismiss();
}