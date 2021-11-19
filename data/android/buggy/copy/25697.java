private void updateStat() {
    getLoaderManager().restartLoader(tom.chinesesuperleague.MainFragment.STAT_LOADER_MAIN, null, this);
    tom.chinesesuperleague.sync.CSLSyncAdapter.syncImmediately(getActivity());
}