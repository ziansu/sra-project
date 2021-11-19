private void startAuthenticationActivity() {
    if (!(org.wso2.iot.agent.utils.Constants.AUTO_ENROLLMENT_BACKGROUND_SERVICE_ENABLED)) {
        android.content.Intent intent = new android.content.Intent(this, org.wso2.iot.agent.activities.AuthenticationActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}