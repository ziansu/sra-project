@java.lang.Override
public void onSuccess(com.hongyu.reward.model.AppLocation locationInfo) {
    com.hongyu.reward.manager.LocationManager.getInstance().removeLocationListener(this);
    leftBtn.setText(location.getCity());
    com.hongyu.reward.manager.LocationManager.saveCity(location.getCity());
}