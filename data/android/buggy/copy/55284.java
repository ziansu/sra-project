@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_settings);
    showToolbar();
    toolbar.setSubtitleTextColor(getResources().getColor(android.R.color.white));
    initView();
}