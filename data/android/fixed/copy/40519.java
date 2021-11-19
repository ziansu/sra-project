public com.allen.library.LayoutParams getParams(com.allen.library.LayoutParams params) {
    if (params == null) {
        params = new android.widget.LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    }
    return params;
}