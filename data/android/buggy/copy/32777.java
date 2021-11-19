public void getCode(java.lang.String phone, com.jinbi.net.OkHttpUtil.ResultCallback callback) throws java.lang.Exception {
    com.jinbi.net.OkHttpUtil.Param phoneParams = new com.jinbi.net.OkHttpUtil.Param("phone", phone);
    com.jinbi.net.OkHttpUtil.getAsyn(Contrast.UserRegToGetCode, callback, phoneParams);
}