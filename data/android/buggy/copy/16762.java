@java.lang.Override
public void resize(int width, int height) {
    super.resize(width, height);
    com.entermoor.blackandwhiteforest.BlackAndWhiteForest.camera.setToOrtho(false, width, height);
}