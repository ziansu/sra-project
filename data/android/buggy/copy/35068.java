@java.lang.Override
public void onItemSelected(com.rey.material.widget.Spinner parent, android.view.View view, int position, long id) {
    selectedGrade1103 = mModeAdapter.getItemAsString(position);
    gp1104 = setGradePoint(selectedGrade1104);
    gradeToaster(selectedGrade1104);
}