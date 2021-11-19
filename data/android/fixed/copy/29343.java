public void setLatitudeDegrees(java.lang.Double latitudeDegrees) {
    if (latitudeDegrees != null) {
        parameters.put(com.smartdevicelink.proxy.rpc.SendLocation.KEY_LAT_DEGREES, latitudeDegrees);
    }else {
        parameters.remove(com.smartdevicelink.proxy.rpc.SendLocation.KEY_LAT_DEGREES);
    }
}