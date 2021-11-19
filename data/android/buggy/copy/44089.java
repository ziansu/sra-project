private void actionButtonChangeStatus(java.awt.event.ActionEvent evt) {
    java.lang.String value = comboBoxSelectStatusForNote.getSelectedItem().toString();
    com.leofesk.quicktodomanager.controller.DataBaseWorker.changeStatusToCurrentNote(value);
    com.leofesk.quicktodomanager.controller.DataBaseWorker.showSelectedNoteInfo(com.leofesk.quicktodomanager.controller.DataBaseWorker.getCurrentNoteID());
}