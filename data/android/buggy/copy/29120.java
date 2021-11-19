@java.lang.Override
public android.view.View getHeader(android.app.Activity activity) {
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(activity);
    header = inflater.inflate(R.layout.view_browse_peer_header, ((android.view.ViewGroup) (getView())));
    updateHeader();
    return header;
}