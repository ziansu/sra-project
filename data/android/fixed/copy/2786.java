@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);
    mv = new com.ruinkami.overrider.view.GameView(this);
    android.widget.LinearLayout.LayoutParams lp = new android.widget.LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
    addContentView(mv, lp);
}