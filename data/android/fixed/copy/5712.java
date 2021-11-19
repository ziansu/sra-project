@java.lang.Override
public void onResume() {
    super.onResume();
    if ((mlastClickedColumn) == ((mColumns) - 1)) {
        scrollToEnd();
    }else {
        mBoardView.scrollToColumn(mlastClickedColumn, false);
    }
}