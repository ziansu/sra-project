@java.lang.Override
public void onClickPasteMenuItem(java.lang.CharSequence text) {
    mView.setTextOnQueryEditor(text);
    mView.assignFocusToQueryEditor();
}