public void update(com.badlogic.gdx.math.Vector2 new_pos) {
    surrounding_.setPosition(com.sewm.defaultteam.Utils.getOriginOfRect(new_pos, surrounding_));
    java.lang.System.out.println((((this.surrounding_.x) + " ") + (this.surrounding_.y)));
}