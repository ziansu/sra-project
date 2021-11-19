@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.view.View vi = convertView;
    vi = inflater.inflate(R.layout.item_search_hospital, null);
    vi.setClickable(true);
    vi.setFocusable(true);
    return vi;
}