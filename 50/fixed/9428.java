@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.as.atlas.googlemapfollowwe.MapsActivity.TAG, ("buttonSend.setOnclick destination=" + (com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination)));
    if ((com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination) != null) {
        sendDestionationToServer(com.as.atlas.googlemapfollowwe.MapsActivity.currentUserInfo.destination);
    }
}