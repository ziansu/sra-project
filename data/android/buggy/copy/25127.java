@java.lang.Override
public void changeBackground() {
    teamfmg.hangman.Settings.load(this);
    android.widget.RelativeLayout rl = ((android.widget.RelativeLayout) (this.findViewById(R.id.relLayout_layout)));
    teamfmg.hangman.Settings.setColor(rl);
}