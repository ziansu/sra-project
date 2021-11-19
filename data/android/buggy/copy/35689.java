private void openDateDialog() {
    com.example.eliasvensson.busify.DateDialog dialog = new com.example.eliasvensson.busify.DateDialog(this);
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    dialog.show(ft, "DatePicker");
}