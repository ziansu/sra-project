@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.paulvarry.intra42.activities.user.UserActivity.openIt(app, adapter.getItem(position));
}