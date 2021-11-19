@java.lang.Override
public void updateDistance(java.lang.String distanceGap) {
    mTvMoveDistance.setText(distanceGap);
    if ((mTvDataMoveDistance) != null) {
        mTvDataMoveDistance.setText(distanceGap);
    }
}