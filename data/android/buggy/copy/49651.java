@java.lang.Override
public int getItemCount() {
    if ((mDataValid) && ((mCursor) != null)) {
        int count = mCursor.getCount();
        return count;
    }
    return 0;
}