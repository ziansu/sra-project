public void showDdc(java.lang.String url, java.lang.String title) {
    android.content.Intent intent = new android.content.Intent(context, com.odong.buddhismhomework.pages.DdcActivity.class);
    intent.putExtra("url", url);
    intent.putExtra("title", title);
    context.startActivity(intent);
}