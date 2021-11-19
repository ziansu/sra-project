@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean b) {
    c.setData(b);
    android.util.Log.e(io.github.sdsstudios.ScoreKeeper.Activity.TAG, "onCheckedChanged");
    saveGameToDatabase();
}