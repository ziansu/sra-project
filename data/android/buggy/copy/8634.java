@java.lang.Override
public void onResume() {
    ((com.letsgo.model.datasources.UserDataSource) (userDataSource)).open();
    super.onResume();
}