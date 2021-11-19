public long[] getActivatedAccountIds() {
    if ((mAccountOptionsAdapter) == null) {
        return org.mariotaku.twidere.util.Utils.getActivatedAccountIds(getActivity());
    }
    return mAccountActionProvider.getActivatedAccountIds();
}