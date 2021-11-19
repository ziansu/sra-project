public void onDestroyActionMode(android.view.ActionMode mode) {
    for (int i = 0; i < (grvNoteList.getCount()); i++) {
        grvNoteList.getChildAt(i).setBackground(getResources().getDrawable(R.drawable.note_background));
    }
}