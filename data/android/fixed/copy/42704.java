@java.lang.Override
public void onPause() {
    datasource.close();
    super.onPause();
}