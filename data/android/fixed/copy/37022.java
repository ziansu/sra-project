public static boolean checkDevice(java.lang.String driver) {
    org.json.JSONObject jObj = com.arksine.easycam.JsonManager.findDevice(driver);
    return jObj != null;
}