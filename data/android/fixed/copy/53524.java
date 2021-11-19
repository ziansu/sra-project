private void getData(int delay) {
    com.kerchin.yellownote.utilities.Trace.d(("getData status " + (getDataHelper.statusName)));
    if ((mNoteWDList) != null) {
        sendMessage(delay);
    }
}