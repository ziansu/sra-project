protected float checkTheLaserCoordinatesX(java.util.ArrayList<com.vratsasoftware.spaceinvaders.components.Laser> lasersShot, com.badlogic.gdx.graphics.g2d.SpriteBatch batch) {
    if ((lasersShot.size()) > 0) {
        return lasersShot.get(0).getLaserX();
    }
    return 0;
}