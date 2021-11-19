@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    android.widget.Toast.makeText(getBaseContext(), "Canceled", Toast.LENGTH_LONG).show();
    filter.setSelection(com.youber.cmput301f16t15.youber.gui.DriverSearchListActivity.adapter.getCount());
}