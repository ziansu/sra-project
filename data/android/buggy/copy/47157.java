@java.lang.Override
public void onClick(android.view.View v) {
    com.amap.api.maps2d.CameraUpdate update = com.amap.api.maps2d.CameraUpdateFactory.changeLatLng(myLocation);
    mAMap.animateCamera(update);
}