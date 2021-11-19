@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(getMainActivity(), com.sandbox.parker.sandbox.song.SongActivity.class);
    android.os.Bundle bundle = new android.os.Bundle();
    intent.putExtra("song", song);
    startActivity(intent);
}