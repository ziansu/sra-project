public void fadeIn(int type) {
    if (type == 1) {
        com.tatteam.popthecamera.GDXGameLauncher.touchable = false;
    }
    this.type = type;
    fadeIn.setAlpha(1);
    fadeIn.setDuration(0.1F);
    addAction(fadeIn);
}