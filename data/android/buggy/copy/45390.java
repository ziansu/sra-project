@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    setSelectAllOnFocus(true);
    setEms(10);
    setInputType(((android.text.InputType.TYPE_CLASS_NUMBER) | (android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL)));
}