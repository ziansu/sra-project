@java.lang.Override
public boolean keyDown(int keycode) {
    if (keycode == (Input.Keys.ENTER)) {
        if (AssetLoader.bgm.isPlaying()) {
            AssetLoader.bgm.pause();
        }else {
            AssetLoader.bgm.play();
        }
    }
    return false;
}