public void onClickDotsButton(final android.view.View view) {
    final android.content.Intent intent = new android.content.Intent(this, com.nervousfish.nervousfish.activities.SettingsActivity.class);
    intent.putExtra(ConstantKeywords.SERVICE_LOCATOR, this.serviceLocator);
    this.startActivity(intent);
}