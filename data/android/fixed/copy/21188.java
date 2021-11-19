@java.lang.Override
public byte[] getBody() throws com.android.volley.AuthFailureError {
    if (bodyContent.isEmpty()) {
        return super.getBody();
    }else {
        return bodyContent.getBytes();
    }
}