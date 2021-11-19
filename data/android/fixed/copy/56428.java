@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.stepanp.luna2d.LunaPrefs.init(this);
    glView = new com.stepanp.luna2d.LunaGlView(this);
    setContentView(glView);
}