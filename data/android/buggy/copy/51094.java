@java.lang.Override
public void onClick(android.view.View v) {
    for (com.inyourface.singbetter.Objects.Session session : toBeRemoved) {
        displayedSessions.add(session);
    }
    toBeRemoved.clear();
    adapter.notifyDataSetChanged();
    setDeleteMode(false);
}