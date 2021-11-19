java.lang.String getURL(java.lang.String rfid, java.lang.String device) {
    return (((((baseURL) + (deviceRemoveCall.get(device))) + "/") + rfid) + "/") + device;
}