@java.lang.Override
public void onSuccess(com.hongyu.reward.model.AppLocation locationInfo) {
    com.hongyu.reward.manager.LocationManager.getInstance().removeLocationListener(mGetLocationListener);
    mCityAdapter.updateLocateState(LocateState.SUCCESS, locationInfo.getCity());
}