public void setEmpty(int res) {
    android.view.View view = getView();
    if (view == null)
        return ;
    
    ((android.widget.TextView) (view.findViewById(R.id.empty))).setText(res);
}