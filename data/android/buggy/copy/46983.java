private void setAdapter() {
    mStudentsList = mStudentsDbHandler.getStudentsFromGroup(mCurrentGroup.getNumber());
    listAdapter = new com.studios.lucian.students.adapter.StudentsListAdapter(getContext(), mStudentsList, this);
    setListAdapter(listAdapter);
}