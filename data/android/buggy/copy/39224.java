private com.sisa.tabata.ui.activity.WorkoutEditActivity getCheckedContext(final android.view.View view) {
    com.sisa.tabata.validation.Assert.isInstanceOf(com.sisa.tabata.ui.activity.WorkoutEditActivity.class, view.getContentDescription(), "View context is not a WorkoutEditActivity");
    return ((com.sisa.tabata.ui.activity.WorkoutEditActivity) (view.getContext()));
}