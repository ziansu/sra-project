@java.lang.Override
public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    matchingSubjectList = new java.util.ArrayList<com.nodoubts.core.Subject>();
    matchingSubjectList.addAll(subjectList);
}