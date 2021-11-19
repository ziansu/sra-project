@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentIndex) < ((mPagination.size()) - 1)) {
        (mCurrentIndex)++;
        update();
    }
}