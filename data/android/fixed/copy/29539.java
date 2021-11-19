public void setBorderColor(int position, int color) {
    if ((mHost) == null) {
        return ;
    }
    getOrCreateViewBackground().setBorderColor(position, color);
}