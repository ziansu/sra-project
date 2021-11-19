@java.lang.Override
protected void onMyLocationChanged(android.location.Location myLocationNew) {
    super.onMyLocationChanged(myLocationNew);
    if ((screenStatus) == (Const.MainUserStatus.START_TRIP)) {
        drawRoute(Const.DrawRouteUserTypes.STARTED_DRIVE, acceptedOrder, 100);
    }
}