public long[] getActivatedAccountIds() {
    if ((mAccountActionProvider) == null) {
        return org.mariotaku.twidere.util.Utils.getActivatedAccountIds(getActivity());
    }
    return mAccountActionProvider.getActivatedAccountIds();
}