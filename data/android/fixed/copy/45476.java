void popForSwipeBack() {
    mLocking = true;
    mFragmentation.back(getFragmentManager());
    mLocking = false;
}