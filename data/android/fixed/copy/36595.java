private java.lang.CharSequence getBathroomAddress() {
    java.lang.String text = "";
    java.lang.String address = mBathroom.getAddress();
    if (!(android.text.TextUtils.isEmpty(address))) {
        text += address;
    }
    return text;
}