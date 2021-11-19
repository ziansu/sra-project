@java.lang.Override
public void onSuccess(com.hongyu.reward.model.AppLocation locationInfo) {
    mCityAdapter.updateLocateState(LocateState.SUCCESS, locationInfo.getCity());
}