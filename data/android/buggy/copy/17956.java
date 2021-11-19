public byte[] getBody() {
    return android.util.Base64.decode(body, Base64.NO_WRAP);
}