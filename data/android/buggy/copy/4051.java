@java.lang.Override
public void onPause() {
    ((com.letsgo.model.datasources.UserDataSource) (userDataSource)).close();
    super.onPause();
}