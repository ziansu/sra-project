@java.lang.Override
public void onShowCollaborators(com.box.androidsdk.content.models.BoxIteratorCollaborations collaborations) {
    android.content.Intent collabsIntent = com.box.androidsdk.share.activities.BoxCollaborationsActivity.getLaunchIntent(this, ((com.box.androidsdk.content.models.BoxFolder) (mShareItem)), mSession);
    startActivity(collabsIntent);
}