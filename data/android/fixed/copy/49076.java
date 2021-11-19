@java.lang.Override
public void resume() {
    userListView.showLoading();
    userListView.hideRetry();
    getListUser();
}