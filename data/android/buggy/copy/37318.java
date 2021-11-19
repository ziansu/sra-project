private void startOcrActivity(android.content.Intent data) {
    android.content.Intent intent = new android.content.Intent(this, com.mgtv.qxx.ttsdemo.OcrActivity.class);
    intent.putExtras(data);
    startActivity(intent);
}