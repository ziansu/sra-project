@java.lang.Override
public void run() {
    showProgress();
    runOperation(new com.softdesign.devintensive.data.storage.operations.ShowUsersOperation(mQuery), com.softdesign.devintensive.ui.activities.UserListActivity.SHOW_USER_QUERY);
}