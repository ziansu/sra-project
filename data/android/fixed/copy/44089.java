private void actionButtonChangeStatus() {
    java.lang.String value = comboBoxSelectStatusForNote.getSelectedItem().toString();
    com.leofesk.quicktodomanager.controller.DataBaseWorker.changeStatusToCurrentNote(value);
    com.leofesk.quicktodomanager.controller.DataBaseWorker.showSelectedNoteInfo(com.leofesk.quicktodomanager.controller.DataBaseWorker.getCurrentNoteID());
}