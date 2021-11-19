public cs.android.viewbase.CSView<T> text(int resId, java.lang.Object... formatArgs) {
    asTextView().setText(cs.java.lang.Lang.format(cs.android.viewbase.CSView.getStringResource(resId), formatArgs));
    return this;
}