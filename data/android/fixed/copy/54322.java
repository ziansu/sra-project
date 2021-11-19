@java.lang.Override
public void setPositionY(float y) {
    float deltaY = y - (getPositionY());
    tiledCollisionComponent.updateBoundingBoxesPosition(0.0F, deltaY);
    super.setPositionY(y);
}