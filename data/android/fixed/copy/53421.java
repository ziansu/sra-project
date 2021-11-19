public static android.graphics.Bitmap decodeBase64(java.lang.String input) {
    input = input.replace("~", "/");
    byte[] decodedBytes = android.util.Base64.decode(input, Base64.NO_WRAP);
    return android.graphics.BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
}