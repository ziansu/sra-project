@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    m_toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.create_game_toolbar)));
    setSupportActionBar(m_toolbar);
    getSupportActionBar().setDisplayShowTitleEnabled(false);
}