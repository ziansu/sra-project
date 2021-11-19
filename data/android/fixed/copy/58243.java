public void setTypeface(android.widget.TextView view, int fontFamilyResId, int style) {
    setTypeface(view, view.getContext().getString(fontFamilyResId), style);
}