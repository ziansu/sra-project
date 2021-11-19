public void bind() {
    android.content.Intent i = new android.content.Intent(mContext, org.tlc.whereat.services.LocationService.class);
    mContext.bindService(i, mLocationServiceConnection, Context.BIND_AUTO_CREATE);
}