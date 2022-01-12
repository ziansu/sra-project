@java.lang.Override
public void onResume() {
    super.onResume();
    ((com.letsgo.model.datasources.UserDataSource) (userDataSource)).open();
}