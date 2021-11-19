@java.lang.Override
public void updateMove(float deltaTime) {
    super.updateMove(deltaTime);
    if (isMoving()) {
        stateTime += deltaTime;
    }
}