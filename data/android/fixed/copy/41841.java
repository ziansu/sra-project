public void setSelected(int selected) {
    if (selected == (mSelected)) {
        return ;
    }
    mSelected = selected;
    setSelection(mSelected);
}