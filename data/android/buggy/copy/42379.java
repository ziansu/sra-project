private void select(int position) {
    if ((mCurrentPosition) != position) {
        if ((mOnItemSelectedListener) != null) {
            postSelectionMsg(position);
        }
    }
}