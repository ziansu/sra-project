public final void showImage(android.content.Context context, java.lang.String str) {
    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
    intent.setDataAndType(android.net.Uri.fromFile(new java.io.File(str)), "image/*");
    context.startActivity(intent);
}