@java.lang.Override
protected void onFinishInflate() {
    super.onFinishInflate();
    createChildren();
    addChildren();
    setOnClickListener(this);
    setOnEditorActionListener();
    setTextChangeListeners();
    if (isInEditMode())
        return ;
    
    inject();
}