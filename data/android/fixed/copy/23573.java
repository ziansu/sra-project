private void setDateToView(int viewId) {
    com.example.eliasvensson.busify.DateDialog dialog = new com.example.eliasvensson.busify.DateDialog(findViewById(viewId), this);
    android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    dialog.show(ft, "DatePicker");
}