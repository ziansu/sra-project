void onTap() {
    if (null != (mMainScene)) {
        boolean statsEnabled = mMainScene.getStatsEnabled();
        mMainScene.setStatsEnabled((!statsEnabled));
    }
}