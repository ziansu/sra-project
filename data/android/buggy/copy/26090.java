@java.lang.Override
public void update(float deltaTime) {
    super.update(deltaTime);
    if (!(getScene().isEditor()))
        updateCameraPos(deltaTime);
    
}