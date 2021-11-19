@java.lang.Override
public void onSuccess(com.hongyu.reward.model.AppLocation locationInfo) {
    leftBtn.setText(location.getCity());
    com.hongyu.reward.manager.LocationManager.saveCity(location.getCity());
}