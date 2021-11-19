@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent previewActivity = new android.content.Intent("com.keepingatimeline.kat.PreviewEvent");
    startActivity(previewActivity);
}