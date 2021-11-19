public void setFrameInScene(android.graphics.RectF frameInScene) {
    this.frameInScene = frameInScene;
    for (com.example.try_gameengine.framework.ILayer child : layers) {
        if (child.isComposite())
            child.setFrameInScene(child.frameInSceneByCompositeLocation());
        
    }
}