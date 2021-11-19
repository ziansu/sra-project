@java.lang.Override
public void update(float elapsed) {
    super.update(elapsed);
    location.x += (currentSpeedX) * elapsed;
    location.y += (currentSpeedY) * elapsed;
}