@java.lang.Override
protected void onHandleIntent(@android.support.annotation.Nullable
android.content.Intent intent) {
    byte[] in = intent.getByteArrayExtra("CRYPTO_FILE_INPUT");
    if ((in.length) > 0)
        java.lang.System.out.println("Dekitaaaaaa");
    else
        java.lang.System.out.println("Dekinaiiiii");
    
}