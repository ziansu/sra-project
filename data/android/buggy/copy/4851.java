public void show() {
    state = com.ubicomp.ketdiary.dialog.AddNoteDialog2.STATE_NOTE;
    com.ubicomp.ketdiary.MainActivity.getMainActivity().enableTabAndClick(false);
    boxLayout.setVisibility(View.VISIBLE);
}