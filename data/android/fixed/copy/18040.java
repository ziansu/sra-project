public void showDdc(java.lang.String url) {
    android.content.Intent intent = new android.content.Intent(context, com.odong.buddhismhomework.pages.DdcActivity.class);
    intent.putExtra("url", url);
    context.startActivity(intent);
}