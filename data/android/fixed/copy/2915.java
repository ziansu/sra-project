public void text(java.lang.String str) {
    dirty = true;
    if (str == null) {
        text = "";
    }else {
        text = str;
    }
    measure();
}