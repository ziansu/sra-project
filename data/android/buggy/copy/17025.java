@com.vertextrigger.entities.player.Test
public void whenPlayerUpdatedDeltaIsAddedToFrame() {
    animator.getUpdatedSprite(delta, angle, position);
    verify(animation).getKeyFrame(delta);
}