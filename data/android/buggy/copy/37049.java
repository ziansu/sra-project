private void readMyList() {
    mMyList = mSharedPreferences.getStringSet(mContext.getString(R.string.MY_LIST_IDS), new java.util.HashSet<java.lang.String>());
}