@java.lang.Override
public void onClick(android.view.View view) {
    if (AudioListActivity.audioListIsActive)
        finish();
    else {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), me.samuki.musicandspeed.AudioListActivity.class);
        startActivity(intent);
    }
}