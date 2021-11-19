@java.lang.Override
public int getItemViewType(int position) {
    return mHeaders.containsKey(position) ? mn.devfest.sessions.SessionListAdapter.TYPE_HEADER : mn.devfest.sessions.SessionListAdapter.TYPE_SESSION;
}