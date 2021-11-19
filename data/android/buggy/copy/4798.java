@java.lang.Override
public void onRightCardExit(java.lang.Object dataObject) {
    android.widget.Toast.makeText(this, ((java.lang.String) (dataObject)), Toast.LENGTH_LONG).show();
    adapter.notifyDataSetChanged();
}