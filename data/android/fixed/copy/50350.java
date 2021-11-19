@java.lang.Override
public void addToWorld(jumpingalien.model.World world) {
    if (canHaveAsWorld(world)) {
        this.world = world;
        world.addShark(this);
    }
}