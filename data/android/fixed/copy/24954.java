public void checkRequirements() {
    if (isFirstRun()) {
        android.content.Intent welcomeIntent = new android.content.Intent(this.context, com.physical_web.cms.physicalwebcms.WelcomeActivity.class);
        context.startActivity(welcomeIntent);
    }else {
    }
}