@java.lang.Override
public int getItemCount() {
    if ((mDataValid) && ((mCursor) != null)) {
        return mCursor.getCount();
    }
    return 0;
}