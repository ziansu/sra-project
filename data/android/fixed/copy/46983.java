private void setAdapter() {
    mStudentsList = mStudentsDbHandler.getStudentsFromGroup(mCurrentGroup.getNumber());
    listAdapter = new com.studios.lucian.students.adapter.StudentsListAdapter(getActivity(), mStudentsList, this);
    setListAdapter(listAdapter);
}