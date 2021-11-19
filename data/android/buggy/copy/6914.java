@java.lang.Override
public void onSelection(com.afollestad.materialdialogs.MaterialDialog dialog, android.view.View itemView, int position, java.lang.CharSequence text) {
    mPriority = position + 1;
    android.util.Log.d(de.grau.organizer.activities.EditorActivity.DEBUG_TAG, ("User Priority Dialog Result = " + (mPriority)));
    setPriorityButton();
}