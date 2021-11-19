public java.util.List<com.hyena.coretext.blocks.ICYEditable> getEditables() {
    if ((mEditableList) == null) {
        mEditableList = getEditableList();
    }
    return mEditableList;
}