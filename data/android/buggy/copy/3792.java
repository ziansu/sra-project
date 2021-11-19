@java.lang.Override
public void onClick(android.view.View v) {
    com.adnroid.pigknight.example.ui.Example.getInstance().switchChildUI(Example.CHILD_ID_PLAYING, false, R.anim.push_bottom_in, R.anim.push_top_out);
}