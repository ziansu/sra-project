@java.lang.Override
public void onTermChanged(int termID, java.lang.String termName) {
    adapter.newList(getCourseScoreByTerm(termID));
}