@java.lang.Override
public void onClick(android.view.View view) {
    isInUpdateMode = true;
    saveSubject(viewedSubjectName, true, viewedSubjectShortening, viewedSubjectRelevance);
}