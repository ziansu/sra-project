@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    android.util.Log.d(com.bruyu.imagewalker.LimitedGridActivity.TAG, "call onDestroyActionMode() ");
    mode.finish();
    inActionMode = false;
    mGrid.setChoiceMode(GridView.CHOICE_MODE_SINGLE);
}