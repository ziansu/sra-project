@java.lang.Override
public void show() {
    world_ = new com.sewm.defaultteam.World();
    worldRenderer_ = new com.sewm.defaultteam.WorldRenderer(world_, true);
    worldController_ = new com.sewm.defaultteam.WorldController(world_);
    flag = true;
}