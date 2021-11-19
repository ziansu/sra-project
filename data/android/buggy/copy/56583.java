@java.lang.Override
public void setAdapter(io.github.clendy.leanback.widget.Adapter adapter) {
    mPendingSelectionInt = NO_POSITION;
    mFocusArchivist = new io.github.clendy.leanback.widget.FocusArchivist();
    super.setAdapter(adapter);
}