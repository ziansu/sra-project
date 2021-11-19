public void checkRequirements(android.content.Context context) {
    if (isFirstRun()) {
        android.content.Intent welcomeIntent = new android.content.Intent(context, com.physical_web.cms.physicalwebcms.WelcomeActivity.class);
        context.startActivity(welcomeIntent);
    }else {
    }
}