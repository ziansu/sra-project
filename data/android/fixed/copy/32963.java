@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int position, long arg3) {
    intent.putExtra("dayIndex", java.lang.Integer.toString(position));
    this.startActivity(intent);
}