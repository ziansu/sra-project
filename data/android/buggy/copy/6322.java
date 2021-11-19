@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (team2beat.com.qrcodes.RegisterView.isLive) {
        confirmAdd(position);
    }
}