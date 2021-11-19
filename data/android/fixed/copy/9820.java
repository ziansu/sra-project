private void removeTimetableAt(int position) {
    getFileManager().delete(timetables.get(position).getId());
    timetables.remove(position);
    adapter.notifyItemRemoved(position);
    updateNoTimetablesTextView();
}