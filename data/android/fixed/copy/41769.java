@java.lang.Override
protected RecyclerView.Adapter initializeAdapter() {
    mAdapter = new app.studentorganizer.adapters.SubjectListAdapter(this, mSubjects, null);
    return mAdapter;
}