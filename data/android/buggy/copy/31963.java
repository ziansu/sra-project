@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(TAG, "OnClick Call");
    if (mSQLiteManager.updateCheckStateInTodo(mDataList.get(position)._ID)) {
    }
}