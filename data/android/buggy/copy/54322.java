@java.lang.Override
public void setPositionY(float y) {
    super.setPositionY(y);
    float deltaY = y - (getPositionY());
    tiledCollisionComponent.updateBoundingBoxesPosition(0.0F, deltaY);
}