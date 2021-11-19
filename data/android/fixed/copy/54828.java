@java.lang.Override
public byte[] getBody() throws com.android.volley.AuthFailureError {
    if ((params) != null) {
        org.json.JSONObject obj = new org.json.JSONObject(params);
        return obj.toString().getBytes();
    }else {
        return null;
    }
}