private android.content.Intent getNotificationIntent() {
    android.content.Intent intent = new android.content.Intent(this, com.codepath.socialshopper.socialshopper.Activities.PickUpList.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    return intent;
}