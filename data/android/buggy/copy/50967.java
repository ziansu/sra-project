@java.lang.Override
public void onActionClicked(int i) {
    switch (i) {
        case 2 :
            android.util.Log.i("Action", "like");
            playlist.likeSong();
            break;
    }
}