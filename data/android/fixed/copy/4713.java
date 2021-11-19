@java.lang.Override
public void act(float delta) {
    super.act(delta);
    if ((animations.size) > 0) {
        animations.get(0).act(delta);
    }
}