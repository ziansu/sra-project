public void nextActivity() {
    android.content.Intent templateIntent = new android.content.Intent(currentActivity, com.example.kbb12.dms.Template.TemplateActivity.class);
    currentActivity.startActivity(templateIntent);
}