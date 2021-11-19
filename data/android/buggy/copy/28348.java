public void setYear(int year) {
    mAdapter.setYear(year);
    setSelectionFromTop(((mAdapter.positionOfYear(mAdapter.getYear())) - (mPositionShift)), mDistanceShift);
}