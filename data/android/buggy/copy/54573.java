protected void onEnable() {
    util.LogUtil.info("onEnabled");
    if (builder.isPaused()) {
        builder.resume();
    }
}