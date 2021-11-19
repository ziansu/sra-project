private android.widget.CheckBox removeSupport(android.widget.CheckBox check, android.view.View convertView, int id) {
    check = ((android.widget.CheckBox) (convertView.findViewById(id)));
    check.setVisibility(View.GONE);
    return check;
}