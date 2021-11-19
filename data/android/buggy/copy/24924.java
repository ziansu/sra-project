@java.lang.Override
public void onCreate(android.os.Bundle icicle) {
    super.onCreate(icicle);
    final android.content.Intent intent = new android.content.Intent(android.provider.DocumentsContract.ACTION_MANAGE_ROOT);
    intent.setData(android.provider.DocumentsContract.buildRootUri(Constants.STORAGE_AUTHORITY, Constants.STORAGE_ROOT_ID));
    startActivity(intent);
    finish();
}