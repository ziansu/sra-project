private void openDateDialog() {
    com.example.eliasvensson.busify.DateDialog dialog = new com.example.eliasvensson.busify.DateDialog();
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    dialog.show(ft, "DatePicker");
}