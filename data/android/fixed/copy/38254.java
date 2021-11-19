@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((player) != null) {
        outState.putInt(ru.korsander.tedrss.fragment.VideoFragment.POSITION, player.getCurrentPosition());
    }
}