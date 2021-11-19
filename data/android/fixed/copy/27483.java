@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    io.github.sdsstudios.ScoreKeeper.PlayerListAdapter.scoreArray.set(position, s.toString().trim());
}